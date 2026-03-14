
public class E1 {
    public static void main(String[] args) {
        int i, j;
        i = 0;
        j = 0;
        int k = 0;
        try {
            k = i / j;
            int[] arr = { 1, 2, 3, 4, 5 };
            System.out.println(arr[9]);
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 is not Possible");
            e.printStackTrace();                                   // Gives the exact Details
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index");
        } catch (Exception e) {                                   // Access any unknown exceptions
            System.out.println("Something Unexpected happended");
        } finally {
            System.out.println("End Execution");
            System.out.println("CLose DB");
            System.out.println("Off Internet");
            System.out.println("Close FIles");
        }
        System.out.println(k);
    }

    static {
        System.out.println("Start Execution");
        System.out.println("Load DB");
        System.out.println("Load Internet");
        System.out.println("Load FIles");
    }
}
