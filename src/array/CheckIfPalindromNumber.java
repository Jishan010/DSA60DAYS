package array;

public class CheckIfPalindromNumber {
    public static void main(String[] args) {
        System.out.println(checkIfPalindromeNumber(-121));
    }


    public static boolean checkIfPalindromeNumber(int n) {
        if(n<0)
            return false;
        int newInput = n;
        int rev = 0;
        while (newInput != 0) {

            int a = newInput % 10;
            rev = rev * 10 + a;
            newInput = newInput / 10;
        }

        return n == rev;
    }
}
