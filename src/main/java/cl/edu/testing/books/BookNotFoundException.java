package cl.edu.testing.books;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(int isbn) {
        super("No existe un libro con ISBN " + isbn);
    }
}
