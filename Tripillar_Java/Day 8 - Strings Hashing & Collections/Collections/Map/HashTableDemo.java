import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(106, "Varada");
        ht.put(117, "Yashas");
        ht.put(128, "Vishal");
        ht.put(99, "Pranav");
        // ht.put(null,"Varshitha"); // no Null keys allowed in Hashtable : NullPointerException

        System.out.println(ht);

        for(Map.Entry<Integer,String> entry : ht.entrySet()) {
            System.out.println(entry.getKey()+", "+entry.getValue());
        }
        ht.remove(101);
        System.out.println(ht);
    }
}
