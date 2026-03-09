// 6 Write a program to check if a number is prime or not.

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        System.out.print("Enter Your Number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i * i  <= n; i++) {
            if (n % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Its Prime");
    }
}
