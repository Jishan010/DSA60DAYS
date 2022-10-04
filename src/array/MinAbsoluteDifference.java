package array;

import java.util.ArrayList;
import java.util.List;

public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int[] input = {4, 2, 1, 3};
        List<List<Integer>> output = minimumAbsDifference(input);
        System.out.println(output);
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> outPutList = new ArrayList<>();
        int miniNumDifference = Integer.MAX_VALUE;
        int firstValue = 0;
        int secondValue = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j] || arr[i] > arr[j]) {
                    //do nothing
                } else {
                    int difference = arr[j] - arr[i];
                    if (miniNumDifference > difference) {
                        miniNumDifference = difference;
                        firstValue = arr[i];
                        secondValue = arr[j];
                    }
                }
            }

            ArrayList<Integer> nums = new ArrayList<>(2);
            nums.add(firstValue);
            nums.add(secondValue);
            miniNumDifference = Integer.MAX_VALUE;
        }
        return outPutList;
    }

}
