package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesFromArray {

    public static void main(String[] args) {
        int[] arr = {1};
        List<Integer> output = findDuplicates(arr);
        System.out.println(output);
    }


    /**
     * nums = [4,3,2,7,8,2,3,1]
     *
     * @param nums
     * @return
     */
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        Arrays.sort(nums);
        //1 2 2 3 3 4 7 8

        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] == nums[i + 1]) {
                duplicates.add(nums[i]);
                i = i + 1;
            }
        }
        return duplicates;
    }


    public static List<Integer> findDuplicates2(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;
    }

}
