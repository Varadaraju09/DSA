// Strings are Immutable we cannot change it
// We can just create copies - original string doesn't change
// The concat() method creates a new Object - so result is ignored

public class Example2 {
    public static void main(String[] args) {
        String s = "Java";
        String s1 = s.concat(" Programming");
        System.out.println(s1);
    }
}
