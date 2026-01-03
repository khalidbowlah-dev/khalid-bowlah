package com.foodordering;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<MenuItem> menu;
    public Restaurant() {
        this.menu = new ArrayList<>();
        loadMenuFromCSV("menu.csv");  // <--- ADD THIS LINE!
    }

    // Add a new item to the restaurant's menu
    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    // Get the whole list of items
    public List<MenuItem> getMenu() {
        return menu;
    }

    // A helper to print the menu nicely
    public void displayMenu() {
        System.out.println("--- MENU ---");
        for (MenuItem item : menu) {
            System.out.println(item.toString());
        }
    }// Method to read the menu.csv file
    public void loadMenuFromCSV(String filename) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); // Split "Burger,8.50" into parts

                // We expect 2 parts: Name and Price
                if (values.length == 2) {
                    String name = values[0].trim();
                    double price = Double.parseDouble(values[1].trim());

                    // Add this new item to your existing 'menu' list
                    this.menu.add(new MenuItem(name, price));
                }
            }
            System.out.println("✅ Menu loaded successfully from " + filename);
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("❌ Error parsing price: " + e.getMessage());
        }
    }
}