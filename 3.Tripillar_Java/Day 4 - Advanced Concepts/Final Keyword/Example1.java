public class Example1 {
    // If we don't initialze a final variable 
    // where is it initialized ? = using constructors

    final int x ;
    Example1() {
        x = 100;
    }

    // If we don't initialze a static final variable 
    // where is it initialized ? = using static block
    static final int y;

    public static void main(String[] args) {
        // Object is must for IIB output
    }
    static {
        y = 10;
        System.out.println("Start");
        System.out.println("DB-Start");
        System.out.println("Internet Start");
        System.out.println("Load Files");
    }
}    

