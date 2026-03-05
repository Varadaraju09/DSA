public class MissingNumber {

    public static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = (n * (n + 1))/2;
        int arraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            arraySum  += arr[i];
        }
        return totalSum - arraySum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};

        System.out.println(missingNumber(arr));
    }
}
