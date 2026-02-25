// 3 Write a program to demonstrate polymorphism using method overriding with a base
// class Shape and derived classes Circle and Rectangle.

    class Shape {

    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Problem3 {
    public static void main(String[] args) {

        Shape s1 = new Circle();     
        Shape s2 = new Rectangle();  

        s1.draw();   
        s2.draw();   
    }
}

