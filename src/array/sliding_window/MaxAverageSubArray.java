package array.sliding_window;

/**
 * https://leetcode.com/problems/maximum-average-subarray-i/
 */
public class MaxAverageSubArray {
    public static void main(String[] args) {
        int[] nums = {-99, -9, -5, -6, -50, -3};
        double maxAverage = findMaxAverage(nums, 4);
        System.out.println(maxAverage);
    }

    // Input: nums = [1,12,-5,-6,50,3], k = 4
    public static double findMaxAverage(int[] nums, int k) {

        if (nums.length == 1)
            return nums[0];

        double maxAverage = Integer.MIN_VALUE;
        double total = 0.0;
        int start = 0;
        int end = 0;

        while (end < nums.length) {

            int subStringLength = end - start + 1;
            if (subStringLength == k) {
                total = total + nums[end];
                //window matched , do calculation here
                if (maxAverage < total / k) {
                    maxAverage = total / k;
                }
                total = total - nums[start];
                start++;
                end++;

            } else {
                total += nums[end];
                end++;
            }
        }
        return maxAverage;
    }

}
