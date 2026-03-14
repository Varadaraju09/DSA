import java.util.ArrayList;
import java.util.List;

public class Example1 {

    private void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
        // Base case
        if(index >= nums.length) {
            ans.add(new ArrayList<>(output));  // Add a copy of the subset
            return;
        }
        // Exclude case
        solve(nums, output, index + 1, ans);
        // Include case
        output.add(nums[index]); // Store that value & move to next index
        solve(nums, output, index + 1, ans);
        // Backtrack & remove the last answer form the output to go to next
        output.remove(output.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }
    public static void main(String[] args) {
        Example1 ex = new Example1();
        int[] nums = {1,2,3};
        List<List<Integer>> result = ex.subsets(nums);
        for(List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
