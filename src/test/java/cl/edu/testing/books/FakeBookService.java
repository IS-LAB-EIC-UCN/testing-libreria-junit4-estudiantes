package cl.edu.testing.books;

/** Doblemente simple hecho a mano: los estudiantes implementan las respuestas. */
public class FakeBookService implements BookService {
    @Override
    public String search(int isbn) {
        // TODO ACTIVIDAD 2:
        // - para 1234 devolver {"titulo":"Ingenieria de Software Moderna"}
        // - para cualquier otro ISBN devolver null
        return null;
    }
}
