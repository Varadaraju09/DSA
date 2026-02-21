public class Dog extends Animal {
        void dog() {
            System.out.println("Dog Barks");
        }
        public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.dog();
        }
    } 