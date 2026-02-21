 // Method Overriding
 class Animals {
     void sound() {                                   // if Static Parent method are called
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animals {
     void sound() {                        // if not Static: child  methods are called 
        System.out.println("Dog barks");   // Therefore : static methods cannot be overriden 
    }
    public static void main(String[] args) {
        Animals ani = new Dog();   // ani(Object) has property of both parent class Animals and child class Dog
        ani.sound();
    }
}