import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int rem = 0;

        while (temp != 1 && temp != 4) {
            int result = 0;
            while (temp > 0) {
                rem = temp % 10;
                result += rem * rem;
                temp /= 10;
            }
            temp = result;
        }
        if (temp == 1) {
            System.out.println("The number is Happy Number");
        } else {
            System.out.println("The number is not Happy Number");
        }
        sc.close();
    }
}
