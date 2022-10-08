package array;

public class PrintFibonacciValue {
    public static void main(String[] args) {
        System.out.println(getFibonacci(8));
    }

    // 0 1 1 2 3 5 8 13 21
    public static int getFibonacci(int num) {
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
