import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E5 {
    public static void main(String[] args) throws IOException {
        String str;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter your data : ");
            str = br.readLine();
            System.out.println(str);
            br.close(); // not needed - Closed Automatically 
        }
    }
}
