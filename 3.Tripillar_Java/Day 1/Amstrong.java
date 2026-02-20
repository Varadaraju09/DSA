import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        double count = 0;
        int rem = 0;
        double result = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        temp = num;
        while (temp != 0) {
            rem = temp % 10;
            result = result + Math.pow(rem, count);
            temp /= 10;
        }
       
         if (result == num) {
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is not Armstrong");
        }
        sc.close();
    }
}
