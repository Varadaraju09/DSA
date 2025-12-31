public class ReverseDigit {
    public static int Reverse(int n) {
        int reverse = 0;
        while(n>0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(Reverse(n));
    }
}
