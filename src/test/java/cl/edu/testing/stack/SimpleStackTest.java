package cl.edu.testing.stack;

import org.junit.Before;
import org.junit.Test;
import java.util.EmptyStackException;
import static org.junit.Assert.*;

public class SimpleStackTest {
    private SimpleStack<Integer> stack;

    @Before
    public void setUp() { stack = new SimpleStack<>(); }

    @Test
    public void unaPilaNuevaEstaVacia() { assertTrue(stack.isEmpty()); }

    @Test
    public void pushIncrementaElTamano() {
        stack.push(10);
        assertEquals(1, stack.size());
    }

    @Test
    public void popDevuelveUltimoElementoInsertado() {
        stack.push(10);
        stack.push(20);
        assertEquals(Integer.valueOf(20), stack.pop());
    }

    @Test(expected = EmptyStackException.class)
    public void popEnPilaVaciaLanzaExcepcion() { stack.pop(); }

    @Test
    public void popReduceElTamano() {
        stack.push(10);
        stack.push(20);
        stack.pop();
        assertEquals(1, stack.size());
    }

    @Test
    public void dosPilasNoCompartenEstado() {
        SimpleStack<Integer> otra = new SimpleStack<>();
        stack.push(10);
        assertTrue(otra.isEmpty());
    }
}
