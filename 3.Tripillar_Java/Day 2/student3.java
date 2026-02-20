public class student3 {

    String name;
    int age;
    student3() {
        System.out.println("default");
    }

    student3 (String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("name"+"age");
    }
    public static void main(String[] args) {
        student3 st = new student3();

        st.name = "yashas";
        st.age = 100;
        System.out.println(st.name+" "+st.age);

    }
}
