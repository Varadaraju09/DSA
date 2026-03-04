public class JoinProof {
    static class Task extends Thread {

        public void run() {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
            System.out.println("Task Finished");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task t1 = new Task();
        t1.start(); // The main thread doesn't wait for this Thread
        t1.join(); // Code will wait (guaranteed!)
        System.out.println("Main Thread Resumes");
    }
}

/*
When ever only start() is used there is not guatantee of child thread execution
the join() guarantees that 1st Child thread runs and then main thread is executed
*/
