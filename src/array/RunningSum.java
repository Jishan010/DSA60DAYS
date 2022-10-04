package array;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));

        int[] arr = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    public static int[] runningSum(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = total + nums[i];
            total = nums[i];
        }
        return nums;
    }
}
