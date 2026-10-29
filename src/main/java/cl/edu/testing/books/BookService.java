package cl.edu.testing.books;

/** Contrato de un servicio remoto; devuelve JSON o null si no existe el libro. */
public interface BookService {
    String search(int isbn);
}
