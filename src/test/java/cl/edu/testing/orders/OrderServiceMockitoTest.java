package cl.edu.testing.orders;

import cl.edu.testing.cart.CartItem;
import cl.edu.testing.cart.ShoppingCart;
import org.junit.Ignore;
import org.junit.Test;
import java.math.BigDecimal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/** Desafio adicional: unidad aislada con mock del repositorio. */
public class OrderServiceMockitoTest {
    @Ignore("BONUS: implementar despues de las actividades 3 y 4")
    @Test
    public void checkoutDelegaGuardarAlRepositorio() {
        // TODO: mock(OrderRepository.class), when(...).thenReturn(...),
        // checkout(...) y verify(repository).save("A01", new BigDecimal("12000"));
        fail("Completar bonus Mockito");
    }
}
