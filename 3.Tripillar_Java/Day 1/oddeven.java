public class oddeven {
    public static void main(String[] args) {
        int num = 4;

        if((num & 1 )== 0) {
            System.out.println("Even "+num);
        }
        else 
            System.out.println("Odd "+num);
    }
}
