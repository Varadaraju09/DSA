public class PalindromeCheck {
    public static void main(String[] args) {
        String sb = "malayalam";
        boolean bool = true;

        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                bool = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is Palindrome: "+bool);
    }
}
