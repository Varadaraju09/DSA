import java.util.Arrays;

public class MergeSort {
    
    public static void merge(int[] arr, int s, int mid, int e) {
        // Sizes of the two subarrays to be merged
        int n1 = mid - s + 1;
        int n2 = e - mid;

        // Temporary Arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // Copy the data to the temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[s+i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Initial indexes of first & second subarrays
        int i = 0, j = 0;
        // Initial index of the merged subarray
        int k = s;
        while (i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements from L[] if any
        while (i < n1) {
            arr[k++] = L[i++];
        }
        // Copy remaining elements from R[] if any
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static int[] mergeSort(int[] arr, int s, int e) {
        if(s < e) {
            // Find the Middle Point
            int mid = s + (e-s) / 2;

            // Sort first and second halves
            mergeSort(arr, s, mid);
            mergeSort(arr, mid+1, e);

            // Merge the second halves into one
            merge(arr,s,mid,e);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array1 = {1,10,5,2,9};
        System.out.println("Given Array: "+Arrays.toString(array1));
        int[] merged = mergeSort(array1,0,array1.length-1);
        System.out.println("Merged Array: "+Arrays.toString(merged));
    }
}