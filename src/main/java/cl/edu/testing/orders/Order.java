package cl.edu.testing.orders;

import java.math.BigDecimal;

public final class Order {
    private final int id;
    private final String customerId;
    private final BigDecimal total;

    public Order(int id, String customerId, BigDecimal total) {
        this.id = id;
        this.customerId = customerId;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public BigDecimal getTotal() {
        return total;
    }
}
