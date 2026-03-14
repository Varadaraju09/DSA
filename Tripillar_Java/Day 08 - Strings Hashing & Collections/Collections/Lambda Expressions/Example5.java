import java.util.ArrayList;
import java.util.Collections;

public class Example5 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println("Initial List: "+list);
        Collections.sort(list , (a,b) -> a - b);
        System.out.println("Ascending Order: "+list);
        Collections.sort(list , (a,b) -> b - a);
        System.out.println("Descending Order: "+list);
    }
}