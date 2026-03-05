interface Payment {
    void pay(); 
} 

public class PaymentDemo {
    public static void main(String[] args) {
        // Boilerplate code
        Payment p = new Payment() {
            public void pay() {
                System.out.println("Payment done Using Credit Card.");
            }
        };
        p.pay();
        // SCALA - java-8 ( Streams, Annotations, Lambdas, Reflection )
        Payment p1 = () -> System.out.println("Cash Payment");
        p1.pay();
    } 
}

/*
ℹ️ Points to remember
✅ One-time Implementation
✅ No need to create separate class
✅ It is used in events & callback functions
*/