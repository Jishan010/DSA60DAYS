package array;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static void main(String[] args) {
        int[] numbers = {3, 4, 1, 9, 56, 7, 9, 12};
        int arr_size = 7;
        int m = 5;
        int minDiff = findMinDiff(numbers, arr_size, m);
        System.out.printf("Minimum element is %d", minDiff);
    }


    public static int findMinDiff(int[] a, int n, int m) {
        // your code here
        Arrays.sort(a);
        int minDifference = a[n - 1];
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
