//  1. Write a program with a method that calculates the factorial of a number using recursion.
import java.util.Scanner;

public class Problem1 {
    static int fact(int n) {
        if (n == 0) {
            return 1;
        }  
        else {
            int f = n * fact(n - 1);
            return f;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        System.out.println("Factorial : " + fact(n));
        sc.close();
    }
}
