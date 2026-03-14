import java.util.Arrays;

class Student {
    String name;
    int USN;
}

class Intern {
    String name;
    int id;
    Intern(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Array of Objects {Student Ojects}
public class E7 {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student();
        students[0].name = "Rahul";
        students[0].USN = 118;
        System.out.println("Name: "+students[0].name+" Usn: "+students[0].USN);

        Intern[] interns = new Intern[]{
            new Intern("Varada", 118),
            new Intern("Pranav", 73),
            new Intern("Yashas", 126),
        };
        // The data type is the class itself 
        for(Intern i : interns) {
            System.out.println(i.name+" "+i.id);
        }
    }
}
