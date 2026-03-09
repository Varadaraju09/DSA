// 4 Write a program that throws an exception if age is less than 18.

public class Problem4 {
    static void checkAge(int age) {
        if(age < 18) {
            throw new ArithmeticException("Not eligible tp vote");
        }
        System.out.println("Eligible to vote");
    }
    public static void main(String[] args) {
        checkAge(16);
    }
}
