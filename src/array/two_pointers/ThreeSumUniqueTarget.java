package array.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumUniqueTarget {

    public static void main(String[] args) {
        int[] nums = {50, 30, 10, 60, 20, 40, 90, 80, 10, 20, 40};
        int target = 100;
        List<List<Integer>> listOfList = threeSum(nums, target);
        System.out.println(listOfList);

       /* int[] nums = {-2, 0, 0, 2, 2};
        int target = 0;
        List<List<Integer>> listOfList = threeSum(nums, target);
        System.out.println(listOfList);*/

    }


    // -2 0 0 2 2

    //50 , 30 ,10, 60, 20, 40, 90, 80 ,10, 20 ,40,
    public static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> listOfList = new ArrayList<>();
        // 1 step sort give array
        Arrays.sort(nums);

        // 10 10 20 20 30 40 40 50 60 80 90

        for (int i = 0; i < nums.length - 3; i++) {

            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int fixedValue = nums[i];
            int newTarget = target - fixedValue;

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {

              /*  if (start != i && nums[start] == nums[start - 1]) {
                    start++;
                    continue;
                }
*/
                if (newTarget == nums[start] + nums[end]) {
                    // print target
                    System.out.println(nums[start] + "+" + nums[end] + "+" + fixedValue + "= " + target);
                    List<Integer> subList = new ArrayList<>();
                    subList.add(fixedValue);
                    subList.add(nums[start]);
                    subList.add(nums[end]);
                    listOfList.add(subList);
                    start++;
                    end--;
                } else if (newTarget < nums[start] + nums[end]) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return listOfList;
    }

}
