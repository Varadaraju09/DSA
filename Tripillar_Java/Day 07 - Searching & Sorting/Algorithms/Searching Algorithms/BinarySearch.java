public class BinarySearch {
    static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                start = mid + 1; // Go to right side
            } else {
                end = mid - 1; // Go to left side
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 9, 12 };
        int key = 4;
        System.out.println(binarySearch(arr, key));
    }
}
