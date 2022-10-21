package array;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/
 */
public class KthLargestInteger {
    public static void main(String[] args) {

        String[] input = {"0","0"};
        String result = kthLargestNumber(input, 2);
        System.out.println(result);
    }


    /**
     * nums = ["3","6","7","10"], k = 4
     *
     * @param nums
     * @param k
     * @return
     */
    public static String kthLargestNumber(String[] nums, int k) {

        BigInteger[] arr = new BigInteger[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = new BigInteger(nums[i]);
        }

        Arrays.sort(arr);

        int kthLargestIndex = arr.length - k;
        String result = String.valueOf(arr[kthLargestIndex]);

        return result;
    }


}
