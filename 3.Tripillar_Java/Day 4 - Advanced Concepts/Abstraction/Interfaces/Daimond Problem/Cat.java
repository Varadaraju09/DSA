public interface Cat {
    default void sound() {
        System.out.println("Meow!");
    }
}