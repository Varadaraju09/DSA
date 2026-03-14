package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Varada", 20);
        System.out.println(s.getname());

        s.setname("Yashas");
        System.out.println(s.getname());
    }
}
