public class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display() {
        System.out.println(id+" "+name+" "+salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(126, "Yashas", 50000.0);
        Employee e2 = new Employee(118, "Varada", 50000.0);

        e1.display();
        e2.display();

    }
}
