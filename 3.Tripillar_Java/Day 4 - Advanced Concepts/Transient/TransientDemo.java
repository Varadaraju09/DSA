import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class User implements Serializable {
    // TO achieve Serialization we implement the Serializable interface

    String usename = "Saurav";
    transient String password = "12345";
}

public class TransientDemo {
    public static void main(String[] args) throws Exception {
        User user = new User();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"));
        oos.writeObject(user);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"));
        User user1 = (User) ois.readObject();
        System.out.println(user1.usename);
        System.out.println(user1.password);
        ois.close();
    }
}
