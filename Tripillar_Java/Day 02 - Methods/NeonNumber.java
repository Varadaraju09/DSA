import java.util.Scanner;

public class NeonNumber {

    static void nenoNumber(int n) {
        int sq = n * n;
        int sum = 0;

        while( sq != 0) {
            int rem = sq % 10;
             sum = sum + rem;
             sq /= 10;
        }
        if(sum == n) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not neon");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nenoNumber(n);
        sc.close();
    }
}
