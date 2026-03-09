// 2. Prefix Sum Array

import java.util.Arrays;

public class Problem2 {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] result = new int[arr.length];
        System.out.println("Given Array: " + Arrays.toString(arr));

        result[0] = arr[0];
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] + arr[i];
        }
        System.out.println("Result Arrays: " + Arrays.toString(result));
    }
}