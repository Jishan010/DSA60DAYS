package recursion;

import java.util.*;

public class SubsetSum {

    public static void main(String[] args) {

        List<Integer> result = new ArrayList<>();
        int[] nums = {3, 1, 2};
        if (nums == null || nums.length == 0) {
            System.out.println("nums is null or empty");
            return;
        }
        int size = nums.length;
        subsetSum(0, 0, nums, size, result);
        if (result.isEmpty()) {
            System.out.println("Result is empty");
            return;
        }
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


    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        String value = "";
        for (String val : map.values()) {
            if (!map.containsKey(val))
                value = val;
        }
        return value;
    }
}
