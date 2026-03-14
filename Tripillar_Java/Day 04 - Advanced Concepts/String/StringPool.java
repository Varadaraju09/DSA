public class StringPool {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);

        String s3 = new String("Java"); // new address
        System.out.println(s1 == s3); // checks address

        System.out.println(s1.equals(s3)); // Checks Value

        /*
        💎 s1 & s1 Share same object in pool
        💎 new String() create new heap object
        💎 == compares references
        💎 .equals() compares values
        */
    }
}
