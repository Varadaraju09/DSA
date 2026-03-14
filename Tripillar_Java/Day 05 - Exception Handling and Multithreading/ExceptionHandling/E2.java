
public class E2 {
    public static void main(String[] args) {
        int i, j;
        i = 0;
        j = 0;
        int k = 0;
        try {
            k = i / j;
            int[] arr = { 1, 2, 3, 4, 5 };
            System.out.println(arr[9]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException  e) { // Multi Catch Bloacking
            System.out.println("Error");
            e.printStackTrace();                                 
        }
        System.out.println("The value of K is "+k);
    }
}
