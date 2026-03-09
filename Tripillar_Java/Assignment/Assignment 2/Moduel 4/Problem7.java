// 7 Write a short program to demonstrate Garbage Collection using System.gc().

public class Problem7 {
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        Problem7 obj1 = new Problem7();
        Problem7 obj2 = new Problem7();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}
