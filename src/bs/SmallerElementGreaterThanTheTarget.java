package bs;

public class SmallerElementGreaterThanTheTarget {


    public static void main(String[] args) {

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 16, 34, 56, 67, 78};
        int resultElement = greaterElement(array2, 57);
        System.out.println(resultElement);

    }

    private static int greaterElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; //better way than using (start+end)/2 to prevent integer overflow exception
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return arr[end];
    }

}
