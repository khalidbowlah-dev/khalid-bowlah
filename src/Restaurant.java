import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<MenuItem> menu;

    public Restaurant() {
        this.menu = new ArrayList<>();
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
    }
}