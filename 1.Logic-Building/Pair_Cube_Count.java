public class Pair_Cube_Count {
    public static int CubePairCount(int n) {
        int count = 0;

        for (int i = 1; i * i * i < n; i++) {
            for (int j = 1; j * j * j < n; j++) {
                if (i * i * i + j * j * j == n) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 28;
        System.out.println(CubePairCount(n));
    }
}
