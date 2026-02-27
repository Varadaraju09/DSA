class PaymentService {

    static void pay(int amount)  {
        if (amount <= 0) {
            throw new ArithmeticException("Invalid payment amount");
        }
        System.out.println("Payment successful");
    }
}

class Controller {
    public static void main(String[] args) {
        PaymentService.pay(-500);
    }
}