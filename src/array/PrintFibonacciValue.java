package array;

import java.util.Arrays;

public class PrintFibonacciValue {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFibonacci(8)));
        System.out.println(Arrays.toString(getFibonacci(33)));
    }

    // 0 1 1 2 3 5 8 13 21
    public static int[] getFibonacci(int num) {
        int a = 0;
        int b = 1;
        int c;
        int[] fibonacciSeries = new int[num + 1];
        fibonacciSeries[0] = 0;

        if (num < 1) {
            return fibonacciSeries;
        }

        fibonacciSeries[1] = 1;
        if (num < 2) {
            return fibonacciSeries;
        }

        for (int i = 2; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;
            fibonacciSeries[i] = c;
        }
        return fibonacciSeries;
    }
}
