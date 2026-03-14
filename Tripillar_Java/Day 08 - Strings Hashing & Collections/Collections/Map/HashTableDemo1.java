import java.util.Hashtable;

public class HashTableDemo1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(106, "Varada");
        ht.put(117, "Yashas");
        ht.put(128, "Vishal");
        ht.put(99, "Pranav");
        
        System.out.println(ht.getOrDefault(106,"Not FOund"));
        System.out.println(ht.getOrDefault(120,"Not FOund"));

        ht.putIfAbsent(104, "Varshitha");
        System.out.println("Updated Table: "+ht);  // This will be added
        ht.putIfAbsent(99, "VIju");
        System.out.println("Updated Table: "+ht); // This won't added
 
    }
}
