// 2 Write a program to find the largest of three numbers using if-else statements.

import java.util.Scanner;

public class Problem2 {
    void largest(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("a is the largest");
        } else if (b > a && b > c) {
            System.out.println("b is the largest");
        } else {
            System.out.println("c is the largest");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the 1st Number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int b = sc.nextInt();

        System.out.print("Enter the 3rd Number : ");
        int c = sc.nextInt();

        Problem2 obj = new Problem2();
        obj.largest(a, b, c);
        sc.close();
    }
}
