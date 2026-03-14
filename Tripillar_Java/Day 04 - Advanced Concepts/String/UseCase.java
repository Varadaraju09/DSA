public class UseCase {
    public static void main(String[] args) {
        String message = "Order Confirmed";
        message = message + " - ID : 101";
        System.out.println(message);
        // message = message + " - ID : 102"
    }
}

/*
String is Immutable
Stored in SCP - String Constant Pool
Every Modification creates a new Object
Good for read-Only Memory
*/
