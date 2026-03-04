// 5 Demonstrate the use of final keyword with variables, methods, and classes.

final class A {
    final int x = 10;

    final void display() {
        System.out.println("Final Method");
    }
}

public class Problem5 {
    public static void main(String[] args) {
        A obj = new A();
        
        System.out.println("Final Variable: "+obj.x);
        obj.display();
    }
}
