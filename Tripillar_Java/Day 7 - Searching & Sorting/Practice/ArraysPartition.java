import java.util.Arrays;

public class ArraysPartition {
    public static void arraysPartition(int[] arr) {
        int n = arr.length;
        int first = 0;
        int last = n - 1;

        while (first < last) {
            while (arr[first] % 2 == 0) {
                first++; // if the left side has even nnumbers move forward
            }
            while (arr[last] % 2 != 0) {
                last--;  // If the right side has odd numbers, move backwards
            }
            if(first < last) {
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,6,5};
        arraysPartition(arr);
    }
}
