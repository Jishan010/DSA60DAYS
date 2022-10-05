package array;

import java.util.Arrays;

/**
 * 283 Move Zeroes
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }

    public static int[] moveZeroes(int[] nums) {

        if (nums.length == 1) {
            return nums;
        }

        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[i] == 0 && nums[j] != 0) {
                ///swap logic
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else if (nums[i] == 0 && nums[j] == 0) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        return nums;
    }

}
