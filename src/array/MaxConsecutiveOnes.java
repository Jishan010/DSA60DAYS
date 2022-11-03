package array;

/**
 * https://leetcode.com/problems/max-consecutive-ones/
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        findMaxConsecutiveOnes(nums);
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);
            } else {
                count = 0;
            }
        }
        return maxConsecutiveOnes;
    }
}
