// 8. Merge Sort

import java.util.Arrays;

public class Problem8 {
    public static void merge(int[] arr, int s, int mid, int e) {
        int n1 = mid - s + 1;
        int n2 = e - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            L[i] = arr[s+i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = s;
        while (i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static int[] mergeSort(int[] arr, int s, int e) {
        if(s < e) {
            int mid = s + (e-s) / 2;

            mergeSort(arr, s, mid);
            mergeSort(arr, mid+1, e);

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
