class Chethah  extends Animal{
    @Override
    void run() {
        System.out.println("Chethah runs very fast");
    } 
    public static void main(String[] args) {
        Chethah chethah = new Chethah();

        chethah.run();
        chethah.eat();
    }
}