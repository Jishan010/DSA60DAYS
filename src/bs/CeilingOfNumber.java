package bs;

public class CeilingOfNumber {

    public static void main(String[] args) {

        int[] array2 = {2, 3, 5, 9, 14, 16, 18};
        int resultIndex = ceilingNumber(array2, 15);
        System.out.println(resultIndex);


    }

    public static int ceilingNumber(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}