package array;

public class PrintValueFromIndex {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(getValueForIndex(numbers.length, numbers, 7));

        int[] numbers1 = {1, 2, 2, 2, 5, 7, 9};
        System.out.println(getCountOfLessOrEqualElement(numbers1.length, numbers1, 2));

        int[] numbers2 = {1, 2, 3, 4, 5};
        printAlternateNumbers(numbers2.length, numbers2);

        int[] numbers3 = {15, 2, 45, 4, 7};
        System.out.println(getValueMatchingIndex(numbers3.length, numbers3));
    }

    //function to print sum of all the integers of an array
    public static int getValueForIndex(int n, int[] arr, int index) {
        if (n <= 0)
            return -1;
        if (index >= n) {
            return -1;
        }
        return arr[index];
    }

    //function to get the count of elements for less and equal than x
    public static int getCountOfLessOrEqualElement(int n, int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                count++;
            }
        }
        return count;
    }

    //function to print alternate values of an array
    public static void printAlternateNumbers(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    //function to get value matching with index
    public static int getValueMatchingIndex(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1) {
                return arr[i];
            }
        }
        return -1;
    }


}
