package com.foodordering;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize Scanner to read your keyboard input
        Scanner scanner = new Scanner(System.in);

        // 2. Setup Restaurant and Load Menu from CSV
        Restaurant foodSpot = new Restaurant();

        System.out.println("******************************************");
        System.out.println("   WELCOME TO THE FOOD ORDERING SYSTEM    ");
        System.out.println("******************************************");

        // --- INTERACTION 1: ASKING FOR NAME ---
        System.out.print("\n> Please enter your name: ");
        String name = scanner.nextLine(); // This waits for you to type your name

        // Create the customer dynamically
        Customer customer = new Customer(name, "ID-001");
        System.out.println("Welcome, " + customer.getName() + "!");

        // --- INTERACTION 2: ASKING WHAT YOU WANT ---
        boolean ordering = true;
        List<MenuItem> menu = foodSpot.getMenu();

        // Check if menu is empty first (Safety check)
        if (menu.isEmpty()) {
            System.out.println("Error: The menu is empty! Check your menu.csv file.");
            ordering = false;
        }

        while (ordering) {
            System.out.println("\n--- MENU ---");
            // Display items with numbers (1, 2, 3...)
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i).toString());
            }
            System.out.println("0. Finish Ordering");

            System.out.print("\n> Select an item number to add to cart: ");
            int choice = scanner.nextInt(); // This waits for you to type a number

            if (choice == 0) {
                ordering = false;
            } else if (choice > 0 && choice <= menu.size()) {
                MenuItem selectedItem = menu.get(choice - 1);
                customer.addToCart(selectedItem);
                System.out.println("   (Added " + selectedItem.getName() + " to your cart)");
            } else {
                System.out.println("   Invalid selection. Try again.");
            }
        }

        // --- CHECKOUT ---
        if (!customer.getCart().isEmpty()) {
            System.out.println("\n--- CHECKOUT ---");
            Order currentOrder = new Order();
            for (MenuItem item : customer.getCart()) {
                currentOrder.addItem(item);
            }
            currentOrder.printOrderSummary();

            // Interaction 3: Payment
            System.out.println("\nSelect Payment Method:");
            System.out.println("1. Cash");
            System.out.println("2. Credit Card");
            System.out.print("> Your Choice: ");
            int paymentChoice = scanner.nextInt();

            double total = currentOrder.getTotalPrice();

            if (paymentChoice == 1) {
                System.out.print("Enter cash amount: ");
                double cash = scanner.nextDouble();
                new CashPayment(total, cash).processPayment();
            } else if (paymentChoice == 2) {
                System.out.print("Enter Card Number: ");
                String card = scanner.next();
                new CreditCardPayment(total, card).processPayment();
            }
        } else {
            System.out.println("You didn't order anything.");
        }

        scanner.close();
    }
}