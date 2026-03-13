public class SlidingWindowBruteForce {
    /*
     * Total windows Formula : n - k + 1 => 8 - 3 + 1 = 6
     */
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        for (int i = 0; i <= arr.length - k; i++) { // 0 to 8-3 = 5 (0-5) six
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
