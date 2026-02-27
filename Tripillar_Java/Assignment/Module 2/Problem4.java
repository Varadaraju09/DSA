// 4 Write a program that uses a default constructor and a parameterized constructor to
// initialize objects of a class Student.

public class Problem4 {
    int id;
    String name;

    Problem4() {
        id = 0;
        name = "Not Assigned";
    }

    Problem4(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Problem4 s1 = new Problem4();
        Problem4 s2 = new Problem4(101, "Varada");

        s1.display();
        s2.display();
    }
}

