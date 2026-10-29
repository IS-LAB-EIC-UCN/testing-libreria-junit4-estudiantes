package cl.edu.testing.orders;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/** Repositorio real en memoria, sin Mockito ni base de datos externa. */
public class InMemoryOrderRepository implements OrderRepository {
    private final Map<Integer, Order> orders = new HashMap<>();
    private int nextId = 1;

    @Override
    public Order save(String customerId, BigDecimal total) {
        Order order = new Order(nextId++, customerId, total);
        orders.put(order.getId(), order);
        return order;
    }

    @Override
    public Optional<Order> findById(int id) {
        return Optional.ofNullable(orders.get(id));
    }
}
