public class FeeRegistration {
    static class  FormFilling extends Thread {
        public void run(){
            System.out.println("Form Filling Started");
        }  
    }
    static class  DocumentUpload extends Thread {
        public void run(){
            System.out.println("Document Upload Started");
        }  
    }
    static class  EmailNotification extends Thread {
        public void run() {
            System.out.println("Confirmation Email Sent!");
        } 
    }
    public static void main(String[] args) {
        FormFilling obj1 = new FormFilling();
        DocumentUpload obj2 = new DocumentUpload();
        EmailNotification obj3 = new EmailNotification();
        System.out.println("Run: ");
        obj1.run();
        obj2.run();
        obj3.run();
        System.out.println("Start: ");
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
/*
Points to remember
💎 Java program starts with main thread.
💎 Output allow parallel execution - concurring
💎 Output order is not guaranteed
💎 Threads share same memory
💎 Improves the performance & responsiveness
💎 when start() is called , the jvm creates a new thread
💎 when run() is called , the jvm creates no thread

✅ Process vs Thread
✅ Thread : A path of execution inside the program
✅ A Process has its own memory
✅ A process is a running program
✅ Threads share the same memory
✅ Creating a thread is cheaper than creating a process
✅ Examples : Process -> Chrome Browser Thread -> New tab of chrome
✅ Closing a tab will not close chorme or kill come

*/