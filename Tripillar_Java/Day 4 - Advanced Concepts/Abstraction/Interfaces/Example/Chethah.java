
public class Chethah implements Animal {
    public void sound() {
        System.out.println("Chethah Roars");
    }

    public void eat() {
        System.out.println("Chethah eats Cat");
    }
    public static void main(String[] args) {
        Chethah chethah = new Chethah();
        chethah.eat();
        chethah.sound();
    }
}
