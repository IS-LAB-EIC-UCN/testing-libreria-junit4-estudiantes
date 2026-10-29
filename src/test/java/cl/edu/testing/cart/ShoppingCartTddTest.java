package cl.edu.testing.cart;

import org.junit.Ignore;
import org.junit.Test;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ShoppingCartTddTest {
    private CartItem item(String isbn, String price) {
        return new CartItem(isbn, new BigDecimal(price));
    }

    @Test
    public void carritoNuevoTieneTotalCero() {
        assertEquals(0, new ShoppingCart().getTotal().compareTo(BigDecimal.ZERO));
    }

    @Ignore("ACTIVIDAD 4 (TDD): primero test rojo, luego codigo productivo")
    @Test
    public void agregarDosLibrosCalculaTotal() {
        // TODO: add libro de 10000 y otro de 5000; total esperado 15000.
        fail("Primer test rojo de TDD");
    }

    @Ignore("ACTIVIDAD 4: implementar luego del primer test verde")
    @Test
    public void dosEjemplaresDelMismoIsbnCuentanDos() {
        // TODO: agregar dos libros mismo ISBN, comprobar getItemCount() == 2.
        fail("Completar caso de repeticion");
    }

    @Ignore("ACTIVIDAD 4")
    @Test
    public void eliminarUnEjemplarActualizaTotal() {
        // TODO: agregar dos libros; removeByIsbn de uno; verificar total.
        fail("Completar eliminacion");
    }

    @Ignore("ACTIVIDAD 4")
    @Test
    public void eliminarIsbnInexistenteRetornaFalse() {
        // TODO: assertFalse(removeByIsbn(...))
        fail("Completar ISBN inexistente");
    }

    @Ignore("ACTIVIDAD 4")
    @Test(expected = NullPointerException.class)
    public void agregarNullNoEstaPermitido() {
        // TODO: comprobar que add(null) lanza la excepcion.
        fail("Completar caso de entrada nula");
    }
}
