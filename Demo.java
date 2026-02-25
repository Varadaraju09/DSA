class Demo {
    public static void main(String[] args) {
        char[] letters = {'a','n','u','p'};
        String s = new String(letters);
        System.out.println(s);

        int result = 0;
        int[] arr = {1,1,2,2,4,3,3};
        for (int i = 0; i < arr.length; i++) {
           result = result ^ arr[i]; 
        }
        System.out.println("The unique element is "+result);
    }
}