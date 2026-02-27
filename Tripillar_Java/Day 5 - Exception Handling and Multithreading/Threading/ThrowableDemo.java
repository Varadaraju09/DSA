public class ThrowableDemo {
    
    static void test() throws Throwable {
        throw new Throwable("Something went wrong!");
    } 
    public static void main(String[] args) {
        try {
            test();
        } catch (Throwable t) {
            // Fully qualified name + message
            System.out.println("Handled: "+t);
            // Message
            System.out.println(t.getMessage());
        }
    }
}

/* ℹ️
-> throw new String("Error"); ❌
-> throw new Ineteger("Error"); ❌
-> throw new Throwable("Error"); ✅
-> throw new Exception(:Error); ✅
-> throw new RuntimeException("Error"); ✅
-> throw new IOException("Error"); ✅
*/