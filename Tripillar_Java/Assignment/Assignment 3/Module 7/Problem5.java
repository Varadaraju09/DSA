// 5. Bubble Sort

import java.util.Arrays;

public class Problem5 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) { 
            for(int j = 0; j < n-i; j++) { 
                if(arr[j] > arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            } 
        }
    } 
    public static void main(String[] args) {
        int[] arr = {9,2,1,3,7,6,5};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
