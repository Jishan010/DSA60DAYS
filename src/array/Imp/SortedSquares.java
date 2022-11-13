package array.Imp;

public class SortedSquares {
    public static void main(String[] args) {
        int[] num = {-4, -1, 0, 3, 10};
        sortedSquares(num);
    }

    public static int[] sortedSquares(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        int[] arr = new int[nums.length];
        int k = nums.length - 1;



        while (i <= j) {
            int startAbs = Math.abs(nums[i] * nums[i]);
            int endAbs = Math.abs(nums[j] * nums[j]);

            if (startAbs < endAbs) {
                arr[k] = endAbs;
                j--;
            } else if (startAbs > endAbs) {
                arr[k] = startAbs;
                i++;
            } else {
                arr[k] = endAbs;
                j--;
            }
            k--;
        }
        return arr;
    }
}
