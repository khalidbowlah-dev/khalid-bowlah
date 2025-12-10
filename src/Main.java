public class Main {
    public static void main(String[] args) {
        // 1. Setup the Restaurant
        Restaurant foodSpot = new Restaurant();
        MenuItem burger = new MenuItem("Cheese Burger", 12.50);
        MenuItem pizza = new MenuItem("Pepperoni Pizza", 15.00);
        MenuItem cola = new MenuItem("Ice Cold Cola", 2.99);

        foodSpot.addMenuItem(burger);
        foodSpot.addMenuItem(pizza);
        foodSpot.addMenuItem(cola);

        // 2. A Customer walks in
        System.out.println("--- Customer Enters ---");
        Customer khalid = new Customer("Khalid Bowlah", "ID-001");
        System.out.println("Welcome, " + khalid.getName() + "!");

        // 3. Customer views menu
        foodSpot.displayMenu();

        // 4. Customer picks food
        System.out.println("\n--- Adding items to cart ---");
        khalid.addToCart(burger);
        khalid.addToCart(cola);

        // 5. Create the Order
        System.out.println("\n--- Checkout ---");
        Order currentOrder = new Order();
        // Move items from cart to order
        for (MenuItem item : khalid.getCart()) {
            currentOrder.addItem(item);
        }

        // 6. Print Receipt
        currentOrder.printOrderSummary();
    }
}