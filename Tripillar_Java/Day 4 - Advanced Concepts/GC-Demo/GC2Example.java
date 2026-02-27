
public class GC2Example {
    @Deprecated
    @Override
    protected void finalize() throws Throwable {  // Don't use it
        System.out.println("Object Destroyed");
    }
    public static void main(String[] args) {
        GC2Example obj = new GC2Example();
        obj = null;
        for (int i = 0; i < 100; i++) {
            System.gc();
        }
    }
}