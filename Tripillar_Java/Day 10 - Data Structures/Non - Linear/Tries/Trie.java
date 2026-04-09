import java.util.Arrays;
import java.util.List;

class TrieNode {
    TrieNode[] children;
    boolean wordend;

    TrieNode() {
        wordend = false;
        children = new TrieNode[26]; // Alphabets a to z [26]
    }
}

public class Trie {

    // insert and search
    // aryan -> {a, r, y, a, n}
    static void insertWord(TrieNode root, String word) {
        /*
         * We will start with root & check if the node exists
         * If exists, we will traverse via the node
         * If not, We will create the node
         */
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            if (curr.children[ch - 'a'] == null) {
                // null means is not present
                // So we create a node of that character
                curr.children[ch - 'a'] = new TrieNode();
            }
            // Move to the children node for the next character
            curr = curr.children[ch - 'a'];
        }
        curr.wordend = true; // We have inserted the word
    }

    static boolean searchWord(TrieNode root, String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            if (curr.children[ch - 'a'] == null) {
                // The first letter doesn't exist
                // So the whole word is not present
                return false;
            }
            curr = curr.children[ch - 'a'];
        }
        return curr.wordend; // If true - exists or else false
    }

    static boolean startsWith(TrieNode root, String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            if (curr.children[ch - 'a'] == null) {
                // The first letter doesn't exist
                // So the whole word is not present
                return false;
            }
            curr = curr.children[ch - 'a'];
        }
        return true;
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        List<String> inputWords = Arrays.asList("yashas", "vishal", "varshitha", "viju", "shashank");
        for (String word : inputWords) {
            insertWord(root, word);
        }
        List<String> searchWord = Arrays.asList("yashas", "vishal", "varshitha", "viju", "shashank", "nirmal", "ashank",
                "anup",
                "pranav");

        for (String word : searchWord) {
            if (searchWord(root, word)) {
                System.out.println(word + " present in Trie");
            } else {
                System.out.println(word + " not present in Trie");
            }
        }
        System.out.println(startsWith(root, "yash"));
        System.out.println(startsWith(root, "son"));
    }
}
