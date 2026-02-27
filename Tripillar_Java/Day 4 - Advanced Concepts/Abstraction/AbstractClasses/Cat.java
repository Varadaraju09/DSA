class Cat  extends Animal{
    @Override
    void run() {
        System.out.println("Cat run fast");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.eat();
    }
}
    