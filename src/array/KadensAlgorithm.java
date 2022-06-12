package array;

/**
 * Kadane's Algorithm
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
 * <p>
 * Input:
 * N = 5
 * Arr[] = {1,2,3,-2,5}
 * Output:
 * 9
 * Explanation:
 * Max subarray sum is 9
 * of elements (1, 2, 3, -2, 5) which
 * is a contiguous subarray.
 */
public class KadensAlgorithm {


    public static void main(String[] args) {
        int n = 4;
        int[] arr = {-1, -2, -3, -4};
        long maxSum = maxSubArraySum(arr, n);
        System.out.println(maxSum);
    }

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    static long maxSubArraySum(int arr[], int n) {
        long maxSum = arr[0];
        long currentSum = arr[0];
        for (int i = 1; i < n; i++) {
            if (currentSum >= 0) {
                currentSum += arr[i];
            } else {
                currentSum = arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
