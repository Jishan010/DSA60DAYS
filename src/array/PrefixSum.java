package array;

import java.util.Arrays;

public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        System.out.println(Arrays.toString(getPrefixSum(arr)));
    }


    public static int[] getPrefixSum(int[] nums) {
        int total = nums[0];
        for (int i = 1; i < nums.length; i++) {
            total += nums[i];
            nums[i] = total;
        }
        return nums;
    }

}
