// 4 Write a program to demonstrate the difference between method overloading and
// method overriding
class Calci {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Calculator extends Calci {

    int add(int a, int b) {
        return a + b + 10;
    }
}

public class Problem4 {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        System.out.println("Overloading:");
        System.out.println(c1.add(10, 20));
        System.out.println(c1.add(10, 20, 30));

        System.out.println("Overriding:");
        System.out.println(c2.add(10, 20));
    }
}