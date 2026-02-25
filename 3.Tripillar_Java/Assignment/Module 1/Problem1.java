// 1 Write a program to check if a given number is positive, negative, or zero.

import java.util.Scanner;

public class Problem1 {

    public void check(int n) {
        if (n == 0) {
            System.out.println("The number is " + n);
        } else if (n > 0) {
            System.out.println("The number " + n + " is Positive");
        } else {
            System.out.println("The number " + n + " is negative");

        }
    }

    public static void main(String[] args) {
        System.out.print("Enter Your Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem1 obj = new Problem1();
        obj.check(n);
        sc.close();
    }
}
