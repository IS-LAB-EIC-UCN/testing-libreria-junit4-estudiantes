package cl.edu.testing.books;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BookSearchMockitoTest {
    private BookService remoteService;
    private BookSearch search;

    @Before
    public void setUp() {
        remoteService = mock(BookService.class);
        search = new BookSearch(remoteService);
    }

    @Test
    public void ejemploMockitoIsbnConocido() {
        when(remoteService.search(1234))
                .thenReturn("{\"titulo\":\"Ingenieria de Software Moderna\"}");

        Book book = search.getBook(1234);

        assertEquals("Ingenieria de Software Moderna", book.getTitle());
        verify(remoteService).search(1234);
    }

    @Ignore("ACTIVIDAD 3: quitar Ignore y completar")
    @Test(expected = BookNotFoundException.class)
    public void isbnInexistenteLanzaExcepcion() {
        // TODO: usar when(...).thenReturn(null), invocar getBook(9999).
        fail("Completar caso inexistente");
    }

    @Ignore("ACTIVIDAD 3: quitar Ignore y completar")
    @Test
    public void isbnInvalidoNoDebeConsultarServicio() {
        // TODO: intentar getBook(0), capturar IllegalArgumentException.
        // TODO: verificar verifyNoInteractions(remoteService).
        fail("Completar validacion de interacciones");
    }

    @Ignore("ACTIVIDAD 3: quitar Ignore y completar")
    @Test(expected = IllegalArgumentException.class)
    public void respuestaSinTituloEsRechazada() {
        // TODO: simular JSON {} o titulo vacio con thenReturn.
        fail("Completar test de JSON invalido");
    }

    @Ignore("ACTIVIDAD 3: quitar Ignore y completar")
    @Test
    public void consultaExactamenteUnaVez() {
        // TODO: configurar mock, invocar la busqueda y verify(..., times(1)).
        fail("Completar test de llamada remota");
    }
}
