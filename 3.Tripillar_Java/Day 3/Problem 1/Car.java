public class Car extends Vehicle {
    void speed(String mode) {
        System.out.println("The bike is at it's "+mode+" mode");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.speed();
        c.speed(200);
        c.speed("eco");
    }
}
