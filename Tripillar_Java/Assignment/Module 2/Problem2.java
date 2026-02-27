// 2. Write a program with a method that checks whether a given string is a palindrome.

import java.util.Scanner;

class Problem2 {
    static boolean Palindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter your String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (Palindrome(str)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
        sc.close();
    }
}