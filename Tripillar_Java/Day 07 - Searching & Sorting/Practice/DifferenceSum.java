import java.util.Arrays;

public class DifferenceSum {
    public static void main(String[] args) {
        int n = 5;
        int[] diff = new int[n]; // 0,0,0,0,0
        int left = 1;
        int right = 3;
        int val = 10;
        diff[left] += val; // 0,10,0,0,0
        
        if((right+1) < n) {
            diff[right+1] -= val; // 0,0,0,0,-10
        }
        
        int[] result = new int[5]; // 0,0,0,0,0
        result[0] = diff[0];
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i-1] + diff[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
