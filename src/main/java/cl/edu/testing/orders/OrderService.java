package cl.edu.testing.orders;

import cl.edu.testing.cart.ShoppingCart;

import java.util.Objects;

public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = Objects.requireNonNull(repository, "repository");
    }

    public Order checkout(String customerId, ShoppingCart cart) {
        if (customerId == null || customerId.trim().isEmpty()) {
            throw new IllegalArgumentException("Cliente obligatorio");
        }
        Objects.requireNonNull(cart, "cart");
        if (cart.getItemCount() == 0) {
            throw new IllegalStateException("Carrito vacio");
        }
        return repository.save(customerId, cart.getTotal());
    }
}
