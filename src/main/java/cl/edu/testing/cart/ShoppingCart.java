package cl.edu.testing.cart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Código deliberadamente incompleto para practicar TDD (rojo, verde, refactorizar). */
public class ShoppingCart {
    private final List<CartItem> items = new ArrayList<>();

    /** Agrega una unidad; se admiten varios ejemplares con el mismo ISBN. */
    public void add(CartItem item) {
        Objects.requireNonNull(item, "item");
        // TODO TDD: implementar después de escribir el primer test rojo.
    }

    public int getItemCount() {
        // TODO TDD
        return 0;
    }

    /** Total monetario; no usar double para sumar precios. */
    public BigDecimal getTotal() {
        // TODO TDD
        return BigDecimal.ZERO;
    }

    /** Elimina un único ejemplar por ISBN. Retorna false si no existe. */
    public boolean removeByIsbn(String isbn) {
        Objects.requireNonNull(isbn, "isbn");
        // TODO TDD
        return false;
    }
}
