 class Cog implements  Cat , Doggy {
    public void sound() {
        System.out.println("some sound");
        // Cat.super.sound()

        Cat.super.sound();

    }
    public static void main(String[] args) {
        Cog cog = new Cog();
        cog.sound();
    }
}
