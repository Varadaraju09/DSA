public class TicketTask implements Runnable  {    
    String task;
    TicketTask(String task) {
        this.task = task;
    }
    public void run() {
        System.out.println(task+" in program");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread( new TicketTask("Seat Assignment"));
        Thread t2 = new Thread(new TicketTask("Payment Processing"));
        Thread t3 = new Thread(new TicketTask("SMS Notification" ));

        t1.start();
        t2.start();
        t3.start();

    }
}

/*
Each Runnable Object is a job , and the Thread Class is responsible
only for execution, which makes this approach cleaner and more flexible.

💫 implements Runnable
💫 better design
💫 Interviewers mostly ask this
💫 Supports multiple imheritance via interfaces
*/
