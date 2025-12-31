public class ClosestNumber {
    public static int closestNum(int n, int m) {
        int closest = 0;
        int minDifference = Integer.MAX_VALUE;

        for (int i = n - Math.abs(m); i <= n + Math.abs(m); ++i) {
            if (i % m == 0) {
                int differnce = Math.abs(n - i);
                if (differnce < minDifference || differnce == minDifference && Math.abs(i) > Math.abs(closest)) {
                    closest = i;
                    minDifference = differnce;
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int n = 13, m = 4;
        System.out.println(closestNum(n, m));
    }
}
