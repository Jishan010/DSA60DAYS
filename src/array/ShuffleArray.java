package array;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;

        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] answer = new int[nums.length];
        int i = 0;
        int j = n;
        int k = 0;
        while (i < n || j < nums.length) {
            if (k % 2 == 0) {
                answer[k] = nums[i];
                i++;
            } else {
                answer[k] = nums[j];
                j++;
            }
            k++;
        }

        return answer;

    }
}
