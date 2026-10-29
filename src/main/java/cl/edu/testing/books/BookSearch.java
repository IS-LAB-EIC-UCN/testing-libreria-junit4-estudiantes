package cl.edu.testing.books;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Objects;

/** Clase bajo prueba: la consulta remota queda detrás de una interfaz inyectada. */
public class BookSearch {
    private final BookService service;
    private final ObjectMapper mapper = new ObjectMapper();

    public BookSearch(BookService service) {
        this.service = Objects.requireNonNull(service, "service");
    }

    public Book getBook(int isbn) {
        if (isbn <= 0) {
            throw new IllegalArgumentException("ISBN debe ser positivo");
        }
        String json = service.search(isbn);
        if (json == null) {
            throw new BookNotFoundException(isbn);
        }
        try {
            JsonNode root = mapper.readTree(json);
            JsonNode titleNode = root == null ? null : root.get("titulo");
            if (titleNode == null || !titleNode.isTextual()
                    || titleNode.asText().trim().isEmpty()) {
                throw new IllegalArgumentException("Respuesta sin titulo valido");
            }
            return new Book(isbn, titleNode.asText());
        } catch (JsonProcessingException ex) {
            throw new IllegalArgumentException("JSON invalido", ex);
        }
    }
}
