public class Cat implements Animal {
    public void sound() {
        System.out.println("Cat Meows");
    }

    public void eat() {
        System.out.println("Cat eats Fish");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sound();
    }
}