package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Two sum , target sum unique pairs
public class TwoSumUniquePairs {

    public static void main(String[] args) {

        int[] arr = {2, 2, 4, 3, 1, 6, 6, 7, 5, 9, 1, 8, 9};
        List<List<Integer>> listOfList = targetSum(arr, 10);
        System.out.println(listOfList);
    }


    public static List<List<Integer>> targetSum(int[] arr, int target) {
        Arrays.sort(arr);
        //1 1 2 2 3 4 5 6 6 7 8 9 9
        List<List<Integer>> listList = new ArrayList<>();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (start != 0 && arr[start] == arr[start - 1]) {
                start++;
                continue;
            }
            if (target == arr[start] + arr[end]) {
                List<Integer> subList = new ArrayList<>();
                subList.add(arr[start]);
                subList.add(arr[end]);
                listList.add(subList);
                //store target sum pair
                System.out.println(arr[start] + " + " + arr[end] + "=" + target);
                end--;
                start++;

            } else if (target < arr[start] + arr[end]) {
                end--;
            } else {
                start++;
            }
        }
        return listList;
    }
}
