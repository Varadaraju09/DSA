import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int rev = 0;
        int rem = 0;
        int temp = num;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if(num == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrone");
        }
        sc.close();
    }
}

