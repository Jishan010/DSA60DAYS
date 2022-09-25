package mathsfordsa.bitwiseoperators;

/**
 * For refrence
 * https://www.youtube.com/watch?v=fzip9Aml6og&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=26&ab_channel=KunalKushwaha
 */
public class IsEvenOddNumber {


    public static void main(String[] args) {
        int n = 67;

        System.out.println(isOddNumber(n));
    }

    private static boolean isOddNumber(int n) {
        return (n & 1) == 1;  //after & 1 to the binary number of n ,if last digit is 1 then odd if it is 0 then even
    }

}
