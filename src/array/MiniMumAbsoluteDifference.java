package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMumAbsoluteDifference {
    public static void main(String[] args) {
        int[] array1 = {4, 2, 1, 3};
        System.out.println(minAbsoluteDifference(array1));

        int[] array2 = {3, 8, -10, 23, 19, -4, -14, 27};
        System.out.println(minAbsoluteDifference(array2));
    }

    public static List<List<Integer>> minAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < min) {
                min = arr[i + 1] - arr[i];
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                List<Integer> pair = new ArrayList<>(2);
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                ans.add(pair);
            }
        }
        return ans;
    }
}
