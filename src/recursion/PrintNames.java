package recursion;

public class PrintNames {

    public static void main(String[] args) {
        printNames(5);
    }

    private static void printNames(int n) {
        if (n < 1)
            return;
        System.out.println("Jishan");
        printNames(n - 1);
    }
}
