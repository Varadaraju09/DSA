interface Calculator {
    int operate(int a, int b);
}

public class LambdaReturnsStatement {
    public static void main(String[] args) {
        Calculator multiply = (a, b) -> {
            int result = a * b;
            return result;
        };
        System.out.println("Mutilplication: " + multiply.operate(10, 20));
    }
}
