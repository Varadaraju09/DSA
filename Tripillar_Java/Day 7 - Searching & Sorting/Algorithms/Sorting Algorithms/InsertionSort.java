import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                // Shift Operation
                arr[j + 1] = arr[j];
                j--; // Create empty space[ ] by shifting
            }
            arr[j + 1] = temp; // Fill the space [ ] with temp variable
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, -1, -4, 6, 2 };
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}