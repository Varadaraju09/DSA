// 7 Write a program to illustrate deadlock concept (demonstration code).

public class Problem7 {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {

            synchronized (lock1) {
                System.out.println("Thread blocks lock1");
                synchronized (lock2) {
                    System.out.println("Thread1 blocks lock2");
                }
            }
        });
        Thread t2 = new Thread(() -> {

            synchronized (lock1) {
                System.out.println("Thread2 blocks lock1");
                synchronized (lock2) {
                    System.out.println("Thread2 blocks lock1");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
