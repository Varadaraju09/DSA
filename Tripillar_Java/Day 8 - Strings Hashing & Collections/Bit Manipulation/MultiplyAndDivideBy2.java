public class MultiplyAndDivideBy2 {

    public static void main(String[] args) {
        int n = 5; 
        int result = n << 1; // Multiplied By two -- left shift
        System.out.println("Multiplied by 2: " + result);
        int x = 6;
        int result1 = x >> 1; // Divided by two -- Rigth shift
        System.out.println("Divided by 2: "+result1);

    }
}