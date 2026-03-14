public class FindTheValueOfRSB {
    public static void main(String[] args) {
        int n = 12; // 1100 = 4
        int result = n & -n;  // Bitwise NOT [ - ] Operator
        System.out.println("Rightmost set Bit Value: "+result);
        System.out.println(~-50000);
    }
}
