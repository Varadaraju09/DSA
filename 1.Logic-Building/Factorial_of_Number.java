public class Factorial_of_Number {
    public static int Fact(int n) {
        if(n == 0) return 1;
        int result = 1;
        while(n>1) {
            result *= n;
            n = n-1;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println(Fact(n));
    }
}
