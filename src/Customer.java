import java.util.ArrayList;
import java.util.List;

// "extends User" means Customer gets all the data from User automatically
public class Customer extends User {

    // The Cart: A list to hold the MenuItems we pick
    private List<MenuItem> cart;

    public Customer(String name, String id) {
        // "super" calls the constructor of the User class
        super(name, id);
        this.cart = new ArrayList<>();
    }

    // Method to add food to the cart
    public void addToCart(MenuItem item) {
        cart.add(item);
        System.out.println(item.getName() + " added to cart.");
    }

    // Method to see what is inside
    public List<MenuItem> getCart() {
        return cart;
    }
}
