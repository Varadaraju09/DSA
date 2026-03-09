public class Problem8 extends Thread{

    public void run() {
        try {
            System.out.println("Thread Running");
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
  public static void main(String[] args) {
    Problem8 t = new Problem8();

    System.out.println("State: "+t.getState());

    t.start();

    System.out.println("State afger start: "+t.getState());
  }  
}
