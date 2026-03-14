public class StringBaseExample {
    public static void main(String[] args) {
        char[] letters = {'A','N','U','P'};
        // String name = letters.toString(); // Wrapper Class

        String name = new String(letters);
        System.out.println(name);
        String jumbled = "Pranav1Is1From1ISE1B1Section";
        String[] words = jumbled.split("1");
        // for (int i = 0; i < words.length; i++) {
        //     System.out.println(words[i]);
        // }

        for(Object o : words) {
            System.out.println(o+" ");
        }

        System.out.println();
        String data = "               I'm     Varada           ";
        System.out.println(data.trim());
    }
}
