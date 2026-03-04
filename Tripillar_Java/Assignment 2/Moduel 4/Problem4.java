// 4 Write a program to reverse a string using StringBuilder.

public class Problem4 {
    public static void main(String[] args) {
        String str = "Java Programming";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println("Reversed String: " + sb);
    }
}
