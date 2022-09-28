package array;

public class PerfectArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(checkIfArrayIsPerfect(array));
    }

    //function to check if array is perfect or not (i.e. is palindrome or not)
    public static String checkIfArrayIsPerfect(int[] arr) {
        String value = "PERFECT";
        int start = 0;
        int end = arr.length - 1;

        if (arr.length <= 0)
            return "NOT PERFECT";

        while (start < end) {
            if (arr[start] != arr[end]) {
                value = "NOT PERFECT";
                return value;
            }
            start++;
            end--;
        }
        return value;
    }
}
