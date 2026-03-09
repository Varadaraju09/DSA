// 5. Two Sum (Optimized)

import java.util.HashMap;

public class Problem5 {
    public static int[] twoSum(int[] arr, int target ) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement  =target - arr[i];

            if(map.containsKey(complement))
                return new int[] {map.get(complement),i};
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};

        int[] res = twoSum(arr,9);

        System.out.println(res[0] + " " + res[1]);
    }
}
