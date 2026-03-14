public class SBI extends Bank {
    void interest(double rate, int years) {
        double totalInterest = (10000 * rate * years)/100;
        System.out.println("Total Interest : "+totalInterest);
    }
    public static void main(String[] args) {
        SBI s = new SBI();
        s.interest();
        s.interest(7.5);
        s.interest(7.5, 3);
    }
}
