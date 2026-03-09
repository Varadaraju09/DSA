// 3 Create a custom exception using throw and throws keywords.

public class Problem3 extends Exception {

    Problem3(String msg) {
        super(msg);
    }
}

class Test {

    static void checkAmount(int amount) throws Problem3 {

        if (amount < 100) {
            throw new Problem3("Amount must be greater than 100");
        }

        System.out.println("Valid Amount");
    }

    public static void main(String[] args) {
        try {
            checkAmount(50);
        }
        catch (Problem3 e) {
            System.out.println(e.getMessage());
        }
    }
}
