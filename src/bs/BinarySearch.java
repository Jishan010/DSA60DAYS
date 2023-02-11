package bs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 */
public class BinarySearch {

    public static void main(String[] args) {
       /* int[] array = {1, 3};
        int resultIndex = searchInsert(array, 2);
        System.out.println(resultIndex);

        int[] array1 = {1};
        int resultIndex1 = searchInsert(array1, 1);
        System.out.println(resultIndex1);
*/
       /* int[] array2 = {1, 3, 5, 6};
        int resultIndex2 = searchInsert(array2, 3);
        System.out.println(resultIndex2);*/

       /* int[] array2 = {1, 3, 5, 6, 8, 22, 34, 50};
        int start = 0;
        int end = array2.length - 1;
        int target = 34;
        int resultIndex = binarySearch(array2, target, start, end);
        System.out.println(resultIndex);*/


        int[] array2 = {1, 2, 5, 2, 3};
        int start = 0;
        int end = array2.length - 1;
        int target = 3;
        Arrays.sort(array2);
        List<Integer> result = new ArrayList<>();
        List<Integer> resultIndex = binarySearch(array2, target, start, end, result);
        System.out.println(resultIndex);


       /* int[] array3 = {1, 3, 5, 6};
        int resultIndex3 = searchInsert(array3, 5);
        System.out.println(resultIndex3);*/
    }


    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    //with recursiev approach
    public static List<Integer> binarySearch(int[] nums, int target, int start, int end, List<Integer> ans) {
        if (start > end) {
            return new ArrayList<>();
        }
        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            ans.add(mid);
        } else if (target > nums[mid]) {
            start = mid + 1;
            binarySearch(nums, target, start, end, ans);
        } else if (target < nums[mid]) {
            end = mid - 1;
            binarySearch(nums, target, start, end, ans);
        }
        return ans;
    }

}
