package array.sliding_window;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/maximum-average-subarray-i/
 */
public class MaxAverageSubArray {
    public static void main(String[] args) {
       /* int[] nums = {-99, -9, -5, -6, -50, -3};
        double maxAverage = findMaxAverage(nums, 4);
        System.out.println(maxAverage);*/


        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        sortPeople(names, heights);
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        int i = 0;
        while (i < names.length) {
            map.put(heights[i], names[i]);
            i++;
        }

        Arrays.sort(heights);

        int j = 0;
        int k = heights.length - 1;
        while (j < names.length) {
            names[j] = map.get(heights[k]);
            j++;
            k--;
        }
        return names;
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
