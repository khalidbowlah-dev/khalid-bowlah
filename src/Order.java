import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;
    private double totalPrice;

    public Order() {
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        calculateTotal(); // Update price whenever we add an item
    }

    // The Logic: Loop through items and add up the prices
    public void calculateTotal() {
        totalPrice = 0.0;
        for (MenuItem item : items) {
            totalPrice += item.getPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void printOrderSummary() {
        System.out.println("--- ORDER SUMMARY ---");
        for (MenuItem item : items) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
        System.out.println("TOTAL: $" + totalPrice);
    }
}
