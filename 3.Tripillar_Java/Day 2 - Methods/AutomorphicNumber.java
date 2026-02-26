import java.util.Scanner;

public class AutomorphicNumber {
    public static boolean autoMorphic(int n) {
        int sq = n * n;
        int temp = n;
        int digitCount = 0;
        
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }
        
        int divisor = 1;
        for (int i = 0; i < digitCount; i++) {
            divisor *= 10;
        }
        
        return (sq % divisor) == n;
    }

    public static void main(String[] args) {
        System.out.print("Enter Your Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Is Automorphic ? "+autoMorphic(n));
        sc.close();
    }
}
