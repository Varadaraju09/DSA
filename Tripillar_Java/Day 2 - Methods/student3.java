public class Student3 {

    String name;
    int age;
    Student3() {
        System.out.println("default");
    }

    Student3 (String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("name"+"age");
    }
    public static void main(String[] args) {
        Student3 st = new Student3();

        st.name = "yashas";
        st.age = 100;
        System.out.println(st.name+" "+st.age);

    }
}
