//  3 Write a program to demonstrate method overloading by creating multiple methods with
// the same name but different parameters 

public class Problem3 {

    public int calcu(int a, int b) {
        return a + b;
    }

    public double calcu(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Problem3 obj = new Problem3();
        System.out.println("Result : " + obj.calcu(10.0, 20.0));

    }
}
