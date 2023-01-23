package recursion;

public class Fibbonnacci {
    public static void main(String[] args) {
        int result = fib(6);
        System.out.println(result);
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;

        int lastFib = fib(n - 1);
        int sLastFib = fib(n - 2);
        return lastFib + sLastFib;
    }
}
