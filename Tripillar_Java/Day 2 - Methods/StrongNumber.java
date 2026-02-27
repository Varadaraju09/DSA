import java.util.Scanner;

public class StrongNumber {

    int factorial(int d) {
        int fact = 1;
        for (int i = 1; i <= d; i++) {
            fact = fact * i;
        }
        return fact;
    }
    boolean isStrong(int num) {
        int rem  = 0 ;
        int temp = num;
        int result = 0;
        while(temp > 0) {
            rem = temp % 10;
            result = result +  factorial(rem);
            temp /= 10;
        }
        if(result == num ) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StrongNumber result = new StrongNumber();
        System.out.println(result.isStrong(num));
        sc.close();
    }
}
