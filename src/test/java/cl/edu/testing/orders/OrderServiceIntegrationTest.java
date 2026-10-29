package cl.edu.testing.orders;

import cl.edu.testing.cart.CartItem;
import cl.edu.testing.cart.ShoppingCart;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/** Integra OrderService con un repositorio real en memoria (NO es un E2E). */
public class OrderServiceIntegrationTest {
    private InMemoryOrderRepository repository;
    private OrderService service;

    @Before
    public void setUp() {
        repository = new InMemoryOrderRepository();
        service = new OrderService(repository);
    }

    @Ignore("ACTIVIDAD 5: habilitar cuando ShoppingCart este implementado")
    @Test
    public void compraSeGuardaYPuedeRecuperarse() {
        // TODO: preparar carrito con libro de 12000, hacer checkout("A01", cart)
        // y verificar que findById(id) encuentra cliente y total.
        fail("Completar prueba de integracion");
    }

    @Ignore("ACTIVIDAD 5: quitar Ignore y completar")
    @Test(expected = IllegalStateException.class)
    public void compraConCarritoVacioSeRechaza() {
        // TODO: checkout con carrito vacio.
        fail("Completar prueba de carrito vacio");
    }
}
