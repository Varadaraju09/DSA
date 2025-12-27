public class SumOf_n_NaturalNumbers {
    public static int sumOf(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++) {
            sum = sum + i;
        }           
         return sum;
    }
    public static void main(String[] args) {
        int result = sumOf(5);
        System.out.println(result);
    }
}
