public class ATMTransaction extends Thread{
    public void run() {
        System.out.println("Processing ATM Transaction");
    }
    public static void main(String[] args) {
        ATMTransaction t = new ATMTransaction();
        System.out.println("Thread State: "+t.getState()); // New
        t.start();
        System.out.println("Thread state after start: "+t.getState()); // Runnable
    }
}

/*
Initially the thread is in the NEW state. After calling start(),
it moves to RUNNABLE and executes the run() method,
The exact timing of the state changes depends on the JVM Scheduler

ℹ️ Points to remember : 
✅ Thread is Created Once
✅ start() change state
✅ Thread cannot be restricted
✅ Final state is TERMINATED or DEAD
*/