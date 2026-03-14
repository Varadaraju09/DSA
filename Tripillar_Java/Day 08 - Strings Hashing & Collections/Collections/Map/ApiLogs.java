// Maitains the insertion Order
import java.util.LinkedHashMap;
import java.util.Map;

public class ApiLogs {
    public static void main(String[] args) {
        Map<String, String> logs = new LinkedHashMap<>();

        logs.put("2","SignUp");
        logs.put("1",   "Login");
        logs.put("4", "Browse Videos");
        logs.put("3", "Scroll Up or Scroll Down");
        logs.put("5", "LogOut");

        System.out.println(logs);
    }
}
