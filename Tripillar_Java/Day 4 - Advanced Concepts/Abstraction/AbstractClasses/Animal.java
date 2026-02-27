abstract class Animal {
    // Normal or Concrete Methods
    // Abstract Methods

    void eat() {
        System.out.println("Animals eat some food");
    }

    // abstract void run() {
    //     // Error
    //     // This Method cannot have a body
    //     // It will be implemented in the child classes
    // }

    abstract void run();
    // If an abstract class has only abstract methods
    // it is 100% Abstraction
    // If it has even 1 normal Method - it is not 100%
}


