public class ResultDeclaration {
    synchronized void declareResult() throws Exception {
        System.out.println("Waiting for Approval....");
        wait();
        System.out.println("Result Declared");
    }

    synchronized void approved() {
        notify();
    }

    public static void main(String[] args) throws Exception {
        ResultDeclaration rd = new ResultDeclaration();
        new Thread(
                () -> {
                    try {
                        rd.declareResult();
                    } catch (Exception e) {
                    }
                }).start();
        Thread.sleep(2000);
        new Thread( () -> rd.approved()).start();
    }
}

/*
The declareResult() method waits until another thread calls.
notify(). During wiat(), the thread releases the lock, allowing 
other threads to enter the synchronized code

ℹ️ Points to Remember:
💫 sleep() -> time based
💫 wait() -> condition based
💫 wait() -> releases lock
💫 wait() -> is used in inter-threaded communication
✅ Order-Placed -> Preparing -> Prepared -> Delivering -> Delivered
*/
