public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int key, int start, int end) {  // Frequently Changing Elements --> as Arguments

        if(start > end) return -1; // Base case -> key not found

        int mid = start + (end - start)/2;

        if(arr[mid] == key)  return mid;

        else if(arr[mid] < key)
            return recursiveBinarySearch(arr, key, mid+1, end);  // start Changes

        else  
           return recursiveBinarySearch(arr, key, start, mid - 1);  // end Changes
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 9, 12 };
        int key = 12;
        System.out.println(recursiveBinarySearch(arr, key, 0, arr.length-1));
    }
}
