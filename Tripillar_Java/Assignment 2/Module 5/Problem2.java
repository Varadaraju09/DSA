// 2 Write a program using try-catch-finally to handle division by zero.

public class Problem2 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Cannot divide by zeero");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
