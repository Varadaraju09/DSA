import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        // the 'true' at the end is the magic ingredient
        // It tells the map to order items by access time,
        // not nsertion time
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        // if the size gets bigger than our capacity, return true
        // (Kick the oldest out)
        return size() > capacity;
    }
    public static void main(String[] args) {
        // Let's build our 3 - pair shoe rock
        LRUCache<String , String> shoeRack = new LRUCache<>(3);
        shoeRack.put("Monday", "Sneakers");
        shoeRack.put("Tuesday", "Boots");
        shoeRack.put("Wednesday", "Sandals");
        System.out.println("Rack Contents: "+shoeRack);
        
        // Now let's say we access the "sneakers" again on Thurday
        // This means Sneakers the MOST recently used
        shoeRack.get("Monday");
        System.out.println("Rack Contents: "+shoeRack);
        
        // We buy a new loadfers and try to put them on the rack
        shoeRack.put("Thursday", "Loafers");
        System.out.println("Rack Contents: "+shoeRack);

        // We notice that Boots have been kicked out,
        // because Sneakers were just accessed.

    }
}
