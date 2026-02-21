import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rem = 0;
        int last = 0;

        while (temp > 0) {
            rem = temp % 10;
            int result = 1;
            for (int i = 1; i <= rem; i++) {
                result = result * i;
            }
            last += result;
            temp /= 10;
        }
        if (last == num) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a Strong Number");
        }
        sc.close();
    }
}
