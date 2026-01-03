package com.foodordering;

public class Main {
    public static void main(String[] args) {
        // 1. Setup the com.foodordering.Restaurant
        Restaurant foodSpot = new Restaurant();
        MenuItem burger = new MenuItem("Cheese Burger", 12.50);
        MenuItem pizza = new MenuItem("Pepperoni Pizza", 15.00);
        MenuItem cola = new MenuItem("Ice Cold Cola", 2.99);
        // 2. A com.foodordering.Customer walks in
        System.out.println("--- com.foodordering.Customer Enters ---");
        Customer khalid = new Customer("Khalid Bowlah", "ID-001");
        System.out.println("Welcome, " + khalid.getName() + "!");

        // 3. com.foodordering.Customer views menu
        foodSpot.displayMenu();

        // 4. com.foodordering.Customer picks food
        System.out.println("\n--- Adding items to cart ---");
        khalid.addToCart(burger);
        khalid.addToCart(cola);

        // 5. Create the com.foodordering.Order
        System.out.println("\n--- Checkout ---");
        Order currentOrder = new Order();
        // Move items from cart to order
        for (MenuItem item : khalid.getCart()) {
            currentOrder.addItem(item);
        }

        // 6. Print Receipt
        currentOrder.printOrderSummary();
        // --- POLYMORPHISM DEMO ---
        System.out.println("\n--- com.foodordering.Payment Process ---");

        // 1. Pay by Cash
        Payment cash = new CashPayment(15.50, 20.00);
        cash.processPayment();

        // 2. Pay by Card
        Payment card = new CreditCardPayment(50.00, "1234567812345678");
        card.processPayment();
    }
}