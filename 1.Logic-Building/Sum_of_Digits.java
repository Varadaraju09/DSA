public class Sum_of_Digits {
    public static int sumOfDigit(int n){
    int remainder = 0;
    int sum = 0;

    while(n!=0) {
        // Extarct last Digit
        remainder = n % 10;

        // Add last digit to sum
        sum += remainder;

        // Remove last digit
        n /= 10;
    } 
    return sum;
    } 
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumOfDigit(n));
    }
}

