// 10. Even Index Contains Even Numbers

import java.util.Arrays;

public class Problem10 {
    public static void rearrange(int[] arr) {

        int even = 0;
        int odd = 1;

        int n = arr.length;

        while (even < n && odd < n) {
            if (arr[even] % 2 == 0)
                even += 2;

            else if (arr[odd] % 2 == 1)
                odd += 2;

            else {
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 3, 6, 12, 1, 5, 8 };

        rearrange(arr);

        System.out.println(Arrays.toString(arr));

    }
}
