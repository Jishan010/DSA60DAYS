package array;

import java.util.Arrays;

/**
 * Its a type  of subarray  problem solved  using sliding windoow algo
 */
public class ChocolateDistributionProblem {

    public static void main(String[] args) {
        int[] numbers = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int arr_size = numbers.length;
        int m = 7;
        int minDiff = findMinDiff(numbers, arr_size, m);
        System.out.printf("Minimum element is %d", minDiff);
    }


    public static int findMinDiff(int[] a, int n, int m) {
        // your code here
        // if there are no chocolates or
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;

        // Sort the given packets
        Arrays.sort(a);

        // Number of students cannot be
        // more than number of packets
        if (n < m)
            return -1;

        //sorted array soo that  minDiffrence can be reduced
        Arrays.sort(a);


        int minDifference = Integer.MAX_VALUE;


        // Find the subarray of size m
        // such that difference between
        // last (maximum in case of
        // sorted) and first (minimum in
        // case of sorted) elements of
        // subarray is minimum.
        int i = 0;
        while (i < n - m + 1) {
            int min = a[i];
            int max = a[i + m - 1];
            if ((max - min) < minDifference)
                minDifference = max - min;
            i++;
        }
        return minDifference;
    }
}
