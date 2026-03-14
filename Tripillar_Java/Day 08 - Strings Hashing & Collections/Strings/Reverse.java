public class Reverse {
    public static void main(String[] args) {
        String str  = "Hello";
        String revrese = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            revrese += str.charAt(i);
        }
        System.out.println("Revrsed: "+revrese);
    }
}
