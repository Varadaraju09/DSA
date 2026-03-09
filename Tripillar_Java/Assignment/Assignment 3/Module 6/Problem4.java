// 4. Find All Pairs With Given Sum

import java.util.HashSet;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {1,5,7,-1,5};
        int target = 6;

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            int complement = target - num;

            if(set.contains(complement))
                System.out.println(num+" "+complement);

            set.add(num);
        }
    }
}
