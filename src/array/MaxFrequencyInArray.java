package array;

import java.util.Arrays;

/**
 * 169 Majority element
 * https://leetcode.com/problems/majority-element/
 */
public class MaxFrequencyInArray {

    public static void main(String[] args) {
        int[] array = {2, 2, 1, 1, 1, 2, 2};
        int maxFrequency = maxFrequency(array);
        System.out.println(maxFrequency);
    }

    /**
     * Max frequency using two pointers
     *
     * @param arr
     * @return
     */
    public static int maxFrequency(int[] arr) {
        Arrays.sort(arr);
        int counter = 0;
        int maxCounter = 0;
        int maxFrequency = arr[0];
        int i = 0;
        int j = 1;
        while (j < arr.length)
            if (arr[i] == arr[j]) {
                counter++;
                i = j;
                j++;

                if (maxCounter < counter) {
                    maxCounter = counter;
                    maxFrequency = arr[i];
                }
            } else {
                i++;
                j++;
                counter = 0;
            }

        return maxFrequency;
    }


}
