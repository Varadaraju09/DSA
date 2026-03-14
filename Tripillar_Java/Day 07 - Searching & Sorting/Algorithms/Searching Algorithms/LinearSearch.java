public class LinearSearch {
   public static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == key) {
            return i; // If target is found return the index
        }
    }
    return -1; // If not found , return an invalid index
   }
   public static void main(String[] args) {
    int[] arr = {10,20,30,40};
    int k = 40;
    System.out.println(linearSearch(arr, k));
   }
}
