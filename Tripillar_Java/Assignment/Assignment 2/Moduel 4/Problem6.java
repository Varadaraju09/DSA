// 6 Write a program to demonstrate static variables and static methods.

class Student {
    static String college = "SCE";
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    static void displayCollege() {
        System.out.println("College: "+college);
    }
    void display() {
        System.out.println(id+" "+name+" "+college);
    }
}

public class Problem6 {
    public static void main(String[] args) {
        Student.displayCollege();

        Student s1 = new Student(1, "Yashas");
        Student s2 = new Student(2, "Varada");

        s1.display();
        s2.display();
    }
}
