// 2. Binary Search - Recursive
public class Problem2 {
    public static int recursiveBinarySearch(int[] arr, int key, int start, int end) {  

        if(start > end) return -1; 

        int mid = start + (end - start)/2;

        if(arr[mid] == key)  return mid;

        else if(arr[mid] < key)
            return recursiveBinarySearch(arr, key, mid+1, end);  

        else  
           return recursiveBinarySearch(arr, key, start, mid - 1);  
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 9, 12 };
        int key = 12;
        System.out.println(recursiveBinarySearch(arr, key, 0, arr.length-1));
    }
}
