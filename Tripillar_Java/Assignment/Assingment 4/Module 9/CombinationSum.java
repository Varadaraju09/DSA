//  LeetCode 39

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void backtrack(int[] nums, int target, int index,
            List<Integer> current, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0)
            return;

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);

            backtrack(nums, target - nums[i], i, current, result);

            current.remove(current.size() - 1);
        }
    }

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, target, 0, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 6, 7 };
        int target = 7;

        System.out.println(combinationSum(nums, target));
    }
}
