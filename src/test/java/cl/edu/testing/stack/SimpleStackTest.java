package cl.edu.testing.stack;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class SimpleStackTest {
    private SimpleStack<Integer> stack;

    @Before
    public void setUp() {
        stack = new SimpleStack<>();
    }

    @Test
    public void unaPilaNuevaEstaVacia() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushIncrementaElTamano() {
        stack.push(10);
        assertEquals(1, stack.size());
    }

    @Ignore("ACTIVIDAD 1: quitar Ignore, escribir el test y detectar un defecto")
    @Test
    public void popDevuelveUltimoElementoInsertado() {
        // TODO: insertar 10 y 20; comprobar que pop devuelve 20 (LIFO).
        fail("Completar el test LIFO");
    }

    @Ignore("ACTIVIDAD 1: quitar Ignore y completar")
    @Test(expected = EmptyStackException.class)
    public void popEnPilaVaciaLanzaExcepcion() {
        // TODO: invocar pop() sin haber agregado elementos.
        fail("Completar el test de excepcion");
    }

    @Ignore("ACTIVIDAD 1: quitar Ignore y completar")
    @Test
    public void popReduceElTamano() {
        // TODO: comprobar size antes y despues de pop.
        fail("Completar el test de tamano");
    }

    @Ignore("ACTIVIDAD 1: quitar Ignore y completar")
    @Test
    public void dosPilasNoCompartenEstado() {
        // TODO: crear otra pila y verificar que sigue vacia.
        fail("Completar prueba de independencia");
    }
}
