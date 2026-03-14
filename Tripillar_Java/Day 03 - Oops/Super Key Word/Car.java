public class Car extends Vehicle {
    String tire = "4 + 1";
    
    Car() {
        System.out.println("Hello i'm Car Car's Contructor");
    }
    
    void show() {
        super.show();
        System.out.println("Vehicle: " + super.tire);
        System.out.println("Car: " + tire);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.show();
    }
}
