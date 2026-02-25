// 2 Write a program to demonstrate single inheritance with a base class Animal and
// derived class Dog.

class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}
