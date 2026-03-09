// 3 Write a program that takes a student's marks as input and prints the corresponding
// grade (A, B, C, D, or F) using a switch statement

import java.util.Scanner;
 
public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0 - 100): ");
        int marks = sc.nextInt();

        switch (marks / 10) {
            case 10:   
            case 9:
                System.out.println("Grade: A");
                break;

            case 8:
                System.out.println("Grade: B");
                break;

            case 7:
                System.out.println("Grade: C");
                break;

            case 6:
                System.out.println("Grade: D");
                break;

            default:
                System.out.println("Grade: F");
        }

        sc.close();
    }
}  
