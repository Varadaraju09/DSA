// 3. Difference Array (Range Update)

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        int n = 5;
        int[] diff = new int[n]; 
        int left = 1;
        int right = 3;
        int val = 10;
        diff[left] += val; 

        if ((right + 1) < n) {
            diff[right + 1] -= val; 
        }

        int[] result = new int[5];
        result[0] = diff[0];
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] + diff[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
