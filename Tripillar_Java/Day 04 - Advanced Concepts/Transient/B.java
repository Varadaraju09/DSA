 interface InterfaceConcepts {
    void display();
}

class A {

}

public class B {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        
        // Old java Code - Boring Code : Boilerplate Code
        InterfaceConcepts obj = new InterfaceConcepts() {
            public void display() {
                System.out.println("Hello");
            }
        };
        // java 8 or 1.8 : Lambda Expressions (Scala)
        InterfaceConcepts obj1 = () -> System.out.println("Hello");
        obj.display();
        obj1.display();
    }
}
