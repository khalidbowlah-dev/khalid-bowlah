import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {

    @Test
    void testCalculateTotal() {
        // 1. Setup
        Order order = new Order();
        MenuItem burger = new MenuItem("Burger", 10.0);
        MenuItem soda = new MenuItem("Soda", 2.5);

        // 2. Action
        order.addItem(burger);
        order.addItem(soda);

        // 3. Assertion
        assertEquals(12.5, order.getTotalPrice(), "Total should be sum of item prices");
    }

    @Test
    void testEmptyOrderTotal() {
        Order order = new Order();
        assertEquals(0.0, order.getTotalPrice(), "Empty order should be 0.0");
    }
}