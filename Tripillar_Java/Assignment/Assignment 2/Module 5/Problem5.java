// 5 Create a thread using Thread class and another using Runnable interface. Compare
// both approaches.

class MyThread  extends Thread {
    public void run() {
        System.out.println("Thread using Thread class");
    }
}

public class Problem5 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

// class MyRunnable implements Runnable {

//     public void run() {
//         System.out.println("Thread using Runnable interface");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Thread t2 = new Thread(new MyRunnable());
//         t2.start();
//     }
// }