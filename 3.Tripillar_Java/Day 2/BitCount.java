import java.util.Scanner;

public class BitCount {

    static int bitCount(int n) {

        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
                n = n >> 1;
            } else {
                n = n >> 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bitCount(n));
        sc.close();

    }
}
