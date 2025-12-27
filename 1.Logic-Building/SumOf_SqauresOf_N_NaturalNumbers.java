public class SumOf_SqauresOf_N_NaturalNumbers {
    public static int squareOf(int n) {
        int square = 0;
        for(int i=1;i<=n;i++) {
            square = square + i*i;
        }           
         return square;
    }
    public static void main(String[] args) {
        int result = squareOf(8);
        System.out.println(result);
    }
}


