public class ThreadWithPriority extends Thread {
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName()+" | Priority: ");
            Thread.currentThread().getPriority();
        }
    }
    public static void main(String[] args) {
        ThreadWithPriority t1 = new ThreadWithPriority();
        ThreadWithPriority t2 = new ThreadWithPriority();
        ThreadWithPriority t3 = new ThreadWithPriority();
        t1.setName("Low Priority Thread");
        t2.setName("Medium Priority Thread");
        t3.setName("High Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        // t3.setPriority(11); IllegalArgumentException


        t1.start();
        t2.start();
        t3.start();
    }
}

/*
Priority Means Not to Execute 1st , it means requesting cpu to give some more time for its Execution

ℹ️ Points to Remember:
💫 Thread Priority is only a suggesyion to the JVM or the scheduler
💫 Higher Priority doesn't guarantee exectuion order.
💫 Higher Priority threads may get more cpu scheduler time.
💫 The actual behaviour depends on the JVM & Operation System
*/
