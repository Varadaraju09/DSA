public class fibonacci {

    void fib(int n) {  // use static --> need not to create object in main func
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for(int i = 1; i <= n; i++) {
            System.out.print(" "+n1);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
    public static void main(String[] args) {
        fibonacci f = new fibonacci(); 
        f.fib(10);
    }
}
