public class CharFrequency {
    public static void main(String[] args) {
        System.out.println('a' - 'a'); // 65 - 65
        System.out.println('a' - 'b'); // 65 - 66
        System.out.println('A' - 'a'); // 65 - 97
        System.out.println((char) ('A' + 32)); // a
        System.out.println((char) ('a' - 32)); // A

        int[] freq = new int[26];

        String str = "varada";
        // Pan-gram : A quick brown fox jumps over the lazy dog

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " -> " + freq[i]);
            }
        }
    }
}
