public class FactorialOfLargeNumber {
    public static int fact(int n) {
        int n1 = 1;
        int n2 = 1;
        int res;
        while(n > 0) {
            res = n1 * n2;
            n1 = n2;
        }
    }
}
