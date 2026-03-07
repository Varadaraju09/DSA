import java.util.ArrayList;
import java.util.Collections;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(118, "Varada"));
        list.add(new Student(126, "Yashas"));
        list.add(new Student(121, "Viju"));

        System.out.println("Student List: ");
        for (Student s : list) {
            System.out.println(+s.id + ", " + s.name);
        }
        Collections.sort(list, (s1, s2) -> s1.id - s2.id);

        System.out.println();

        // Ascending Order based on id
        System.out.println("Ascending Order: ");
        for (Student s : list) {
            System.out.println(s.id + ", " + s.name);
        }
    }
}
