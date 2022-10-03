package array;

public class MaxFrequencyInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 7, 9, 9, 9, 10};
        int maxFrequency = maxFrequency(array);
        System.out.println(maxFrequency);
    }

    /**
     * Max frequency using two pointers
     *
     * @param arr
     * @return
     */
    public static int maxFrequency(int[] arr) {
        int counter = 0;
        int maxCounter = 0;
        int maxFrequency = arr[0];
        int i = 0;
        int j = 1;
        while (j < arr.length)
            if (arr[i] == arr[j]) {
                counter++;
                i = j;
                j++;

                if (maxCounter < counter) {
                    maxCounter = counter;
                    maxFrequency = arr[i];
                }
            } else {
                i++;
                j++;
                counter = 0;
            }

        return maxFrequency;
    }


}
