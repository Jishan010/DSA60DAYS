package recursion;

public class PrintNames {

    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println(fact);
    }

    private static void printNames(int n) {
        if (n < 1)
            return;
        System.out.println("Jishan");
        printNames(n - 1);
    }

    //print numbers linearly 1 to N
    private static void printNumbers(int n) {
        if (n < 1)
            return;
        printNumbers(n - 1);
        System.out.println(n);
    }


    //print number in  reverse order  from backtracking  n=3 , i = 1
    private static void printReverseNumbers(int n, int i) {
        if (i > n)
            return;
        printReverseNumbers(n, i + 1);
        System.out.println(i);
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n + factorial(n - 1);
    }
}
