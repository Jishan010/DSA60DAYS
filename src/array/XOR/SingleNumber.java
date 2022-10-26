package array.XOR;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};
        singleNumber(arr);
    }

    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }


}
