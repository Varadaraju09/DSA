// 7 Write a program to print a pyramid pattern using nested loops for a given number of rows

import java.util.Scanner;

public class Problem7 {
    static void Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern(n);
        sc.close();
    }
}

