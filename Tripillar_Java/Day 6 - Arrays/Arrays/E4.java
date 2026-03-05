public class E4 {
    public static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static int[] createArray() {  // returns an array of integers
        return new int[]{10,20,30};    // new array created & returned
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
        int[] result = createArray();
        for(int num : result) {
            System.out.print(num+" ");
        }
        System.out.println();

        // Annonymous Array -> we don't have a reference / object.
        // After the method call , we can never access it.
        printArray(new int[]{10,20,20});
    }
}
