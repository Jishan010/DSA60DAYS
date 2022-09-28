package array;

public class TotalSum {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};
        System.out.println(totalSum(numbers.length, numbers));

        int[] numbers1 = {5, 8, 3, 10, 22, 45};
        System.out.println(totalSum(numbers1.length, numbers1));
    }

    //function to print sum of all the integers of an array
    public static int totalSum(int n, int[] arr) {
        int total = arr[0];
        for (int i = 1; i < n; i++) {
            total += arr[i];
        }
        return total;
    }
}
