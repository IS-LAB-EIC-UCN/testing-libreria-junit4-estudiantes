package cl.edu.testing.books;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/** Pruebas sin red ni base de datos, usando un doble escrito a mano. */
public class BookSearchManualTest {

    @Ignore("ACTIVIDAD 2: completar FakeBookService y quitar Ignore")
    @Test
    public void fakePermiteBuscarLibroConocido() {
        // TODO: crear BookSearch con FakeBookService, buscar 1234 y verificar titulo.
        fail("Completar prueba con fake manual");
    }

    @Ignore("ACTIVIDAD 2: quitar Ignore y completar")
    @Test(expected = BookNotFoundException.class)
    public void fakeRepresentaLibroInexistente() {
        // TODO: buscar un ISBN distinto de 1234.
        fail("Completar caso de libro inexistente");
    }
}
