package recursion;

/**
 * Print number program to demonstrate recursion function
 */
public class PrintNumbers {

    public static void main(String[] args) {
        print(1);
    }

    private static void print(int n) {
        //base condition
        if (n == 5) {
            System.out.println(n);
            return;
        }
        //body
        System.out.println(n);

        //recursive call
        //If you are calling function again and again you can treat it as a separate call in the stack
        //this is tail recursion
        //this is the last function call
        print(n + 1);
    }

}
