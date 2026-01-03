public class Perfect_Number {
    static boolean perfectNumber(int n) {
        if(n <= 1) return false;

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sum += i;
            }
            if(sum == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(perfectNumber(n));
    }
}
