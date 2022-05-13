package array;

/**
 * Minimum  and maximum from an array
 */
public class MinMaxFromArray {

    private static int min = 0;
    private static int max = 0;

    // Class Pair is used to return two values from getMinMax() */
    static class Pair {
        int min;
        int max;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 50, 7, 14, 1};
        minMaxFromArray(numbers);
        System.out.println("min :" + min + " " + "max :" + max);


        // recommended  approach
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        MinMaxFromArray.Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }

    /**
     * solving from simple loop my brute  force solution
     *
     * @param numbers
     */
    private static void minMaxFromArray(int[] numbers) {
        min = numbers[0];
        max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i])
                min = numbers[i];

            if (max < numbers[i])
                max = numbers[i];
        }
    }


// recomennded approach
    // Java program of above implementation
    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        int i;

        /*If there is only one element then return it as min and max both*/
        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }

		/* If there are more than one elements, then initialize min
	and max*/
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }

        for (i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }

        return minmax;
    }

}
