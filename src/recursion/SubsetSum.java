package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetSum {

    public static void main(String[] args) {

        List<Integer> result = new ArrayList<>();
        int[] nums = {3, 1, 2};
        int size = nums.length;
        subsetSum(0, 0, nums, size, result);
        Collections.sort(result);
        System.out.println(result);
    }

    static void subsetSum(int index, int sum, int[] arr, int n, List<Integer> ans) {
        if (index == n) {
            ans.add(sum);
            return;
        }
        //pick condition
        subsetSum(index + 1, sum + arr[index], arr, n, ans);
        //non pick condition
        subsetSum(index + 1, sum, arr, n, ans);
    }
}
