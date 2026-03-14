import java.util.HashMap;

public class FrequencyMap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr) {
            // {1=0,2=0,3=0,4=0,5=0} -> {1=1,...} -> {1=1, 2=1,...}
            map.put(num , map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
        System.out.println(map.get(4));
    }
}
