// 8. Longest Subarray With Sum = K

import java.util.HashMap;

public class Problem8 {
    public static int longest(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k)
                max = i + 1;

            if (map.containsKey(sum - k))
                max = Math.max(max, i - map.get(sum - k));
            if (!map.containsKey(sum))
                map.put(sum, i);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 5, 2, 7, 1, 9 };

        System.out.println(longest(arr, 15));
    }
}
