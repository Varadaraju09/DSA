import java.util.ArrayList;
import java.util.Collections;

class Product {
    String name;
    int price;
    int quantity;

    Product(String name , int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
public class ItemSorting {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product("Books",500,10));
        list.add(new Product("Pens",10,100));
        list.add(new Product("Pencils",5,5));

        System.out.println("Product List: ");
        for (Product p : list) {
            System.out.println(p.name + ", " + p.price+", "+p.quantity);
        }
        Collections.sort(list, (p1, p2) -> p2.quantity - p1.quantity);

        System.out.println();
        System.out.println("Product List in Descending: ");
        for (Product p : list) {
            System.out.println(p.name + ", " + p.price+", "+p.quantity);
        }
    }
}
