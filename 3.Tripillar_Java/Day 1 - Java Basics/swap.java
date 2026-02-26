class swap {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println("Before Swap");
        System.out.println("a = "+a+" "+"b = "+b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swap");
        System.out.println("a = "+a+" "+"b = "+b);
    }
}
    
