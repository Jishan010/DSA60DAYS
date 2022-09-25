package twopointers;


import java.util.Arrays;

import static java.lang.Math.abs;


/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 * <p>
 * Return the sum of the three integers.
 * <p>
 * Assume that there will only be one solution
 * <p>
 * Example:
 * <p>
 * given array S = {-1 2 1 -4},
 * <p>
 * and target = 1.
 * <p>
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
 */
public class ThreeSumClosest {

    public static void main(String[] args) {

        int[] array = { 2, 1, -9, -7, -8, 2, -8, 2, 3, -8 };
        int target = -1;

        int threeSumClosest = threeSumClosest(array, target);
        System.out.println(threeSumClosest);
    }

    public static int threeSumClosest(int[] arr, int target) {
        //sort array first
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) { //fixating the first element
            int start = i + 1; //first element
            int end = arr.length - 1;

            while (start < end) {

                if (arr[i] + arr[start] + arr[end] == target) {
                    return arr[i] + arr[start] + arr[end];
                } else if (abs(arr[i] + arr[start] + arr[end] - target) < diff) {
                    diff = abs(arr[i] + arr[start] + arr[end] - target);
                    ans = arr[i] + arr[start] + arr[end];
                }

                if (arr[i] + arr[start] + arr[end] > target)
                    end--;
                else
                    start++;
            }
        }
        return ans;
    }


}
