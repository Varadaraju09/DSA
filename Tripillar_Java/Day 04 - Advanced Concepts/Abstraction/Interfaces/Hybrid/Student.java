public class Student extends Person implements Sports {
    Student(String name) {
        super(name); // Here we call parent class constructor -- super() method
    }

    public void play() {
        System.out.println("He plays football");
    }

    public static void main(String[] args) {
        Student st = new Student("Anup");
        st.play();
    }
}
