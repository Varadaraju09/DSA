import java.util.Arrays;

public class E5 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5670};
        System.out.println("Printing Arrays: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        System.out.println("Empty Array: ");
        int[] arr2 = new int[arr1.length];
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        // Copy array into another array - 1. for loop
        System.out.println("Using For Loop: ");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        // 2. arraycopy
        System.out.println("Using arraycopy: ");
        int[] arr3 = new int[arr2.length];
        // arraycopy(src, s_pos =, des, des_pos, len)
        System.arraycopy(arr2, 0, arr3, 0, arr2.length);
        System.out.println(Arrays.toString(arr3));
        System.out.println();

        System.out.println("Using Clone: ");
        int[] arr4 = arr3.clone();
        System.out.println(Arrays.toString(arr4));
    }
}
