import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        System.out.println("Cart Items: "+cart);

        cart.remove("Mouse"); // Remove the item
        cart.set(1,"Mechanical Keyboard");  // UPdate
        System.out.println("Cart Items: "+cart);
        System.out.println("Cart Size: "+cart.size());
    }
}
