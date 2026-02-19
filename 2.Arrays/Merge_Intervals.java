import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Merge_Intervals {
    public static int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;

        // step 1 : Sort by start time
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        // Step 2: Add first intrval
        merged.add(intervals[0]);

        // Step 3: Merge overlapping intervals
        for (int i = 0; i < intervals.length; i++) {
            int[] last = merged.get(merged.size() - 1);
            int[] current = intervals[i];

            if(current[0] <= last[1]) {
                last[1] = Math.max(last[1], current[1]);
            } else {
                merged.add(current);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);

        for(int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
