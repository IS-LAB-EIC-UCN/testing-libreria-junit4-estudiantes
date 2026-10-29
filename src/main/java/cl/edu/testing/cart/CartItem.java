package cl.edu.testing.cart;

import java.math.BigDecimal;
import java.util.Objects;

public final class CartItem {
    private final String isbn;
    private final BigDecimal price;

    public CartItem(String isbn, BigDecimal price) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new IllegalArgumentException("ISBN vacio");
        }
        this.price = Objects.requireNonNull(price, "price");
        if (price.signum() < 0) {
            throw new IllegalArgumentException("Precio negativo");
        }
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
