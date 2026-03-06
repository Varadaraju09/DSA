import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "SILENT";
        String s2 = "LISTEN";

        char[] a = s1.toCharArray();  // S ,I ,L ,E ,N ,T 
        char[] b = s2.toCharArray();  // L ,I ,S ,T ,E ,N

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        if(Arrays.equals(a,b)) {
            System.out.println("Anangram");
        }
        else {
            System.out.println("Not Anagrams");
        }

    }
}
