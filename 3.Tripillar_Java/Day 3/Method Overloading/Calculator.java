// Method Overloading 
public class Calculator {
    static void add(int a , int b) {
        System.out.println(a + b);
    }
    static void add(double a , double b) {
        System.out.println(a + b);
        System.out.println("Hello");
    }

    static void add(int a , int b , int c) {
        System.out.println(a + b + c);
    }
    public static void main(String[] args) {
        add(5,8);
        add(5,5);
        add(1 , 2 , 3);
    }
}
