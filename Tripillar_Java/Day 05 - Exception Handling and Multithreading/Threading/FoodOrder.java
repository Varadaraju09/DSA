public class FoodOrder extends Thread {

    String task;
    FoodOrder(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task+" started");
    }
    public static void main(String[] args) {
        FoodOrder cooking = new FoodOrder("Cooking");
        FoodOrder packing = new FoodOrder("Packing");
        FoodOrder serving = new FoodOrder("Serving");

        cooking.start();
        packing.start();
        serving.start();
    }
}

/*
ℹ️ Ponints to remember
💫 Extend Thread
💫 Override run()
💫 Use start()
💫 It is less flexible because of inheritance limitation
*/