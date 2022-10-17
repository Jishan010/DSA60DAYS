package array;

import java.util.Arrays;
import java.util.HashMap;

public class MostFequentEvenNumber {


    /**
     * nums = [0,1,2,2,4,4,1]
     *
     * @param nums
     * @return
     */
    public static int mostFrequentEven(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {

        }

        return 0;
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(array, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                return new int[]{start + 1, end + 1};
            } else if (numbers[start] + numbers[end] > target) {

                end--;
            } else if (numbers[start] + numbers[end] < target) {

                start++;
            }
        }

        return null;
    }
}