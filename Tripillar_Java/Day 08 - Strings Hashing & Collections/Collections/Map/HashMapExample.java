// import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Map<String , String> hasMap = new HashMap<>(); // It sorts and Dispaly
        Map<String , String> hasMap = new LinkedHashMap<>(); // Maintains the insertion Order

        // The values can be duplicate , but keys have to be unique
        hasMap.put("01", "aaa");
        hasMap.put("03", "bbb");
        hasMap.put("02", "ccc");
        hasMap.put("04", "ddd");

        System.out.println(hasMap);

        for(Map.Entry<String, String> entry : hasMap.entrySet()) {
            System.out.println("Key: "+entry.getKey()+" | Value: "+entry.getValue());
        }
    }
}
