package cl.edu.testing.orders;

import java.math.BigDecimal;
import java.util.Optional;

public interface OrderRepository {
    Order save(String customerId, BigDecimal total);
    Optional<Order> findById(int id);
}
