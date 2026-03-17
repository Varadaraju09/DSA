//  LeetCode 387

import java.util.Scanner;

public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int result = firstUniqChar(s);

        System.out.println("Index of first unique character: " + result);

        sc.close();
    }
}
