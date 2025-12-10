public class MenuItem {
    // 1. Private variables (This is Encapsulation)
    private String name;
    private double price;

    // 2. Constructor (How we create a new item)
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // 3. Getters (Methods to read the data safely)
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // 4. A helper to print the item nicely
    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}