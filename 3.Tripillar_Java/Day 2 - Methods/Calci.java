public class Calci {
    void add(int a, int b) {
        System.out.println(a + b);
        return ; // The end
        // System.out.println(a + b); --> error : Unreachable code
    }

    int add1(int a , int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calci obj = new Calci();
         obj.add(4, 5);
         System.out.println(obj.add1(4, 5));

    }
}
