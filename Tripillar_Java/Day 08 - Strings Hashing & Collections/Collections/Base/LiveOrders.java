import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders = new ArrayList<>();
        // new orders are added  
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        liveOrders.add("ORD104");

        // Check order
        System.out.println("ORD103 exixts ? "+liveOrders.contains("ORD103"));
        System.out.println("ORD103 removed ? "+liveOrders.remove("ORD103"));
        System.out.println("ORD103 exixts ? "+liveOrders.contains("ORD103"));
        // Check the live orders
        liveOrders.clear();
        System.out.println("Orders After Closing:"+liveOrders);
    }
}
