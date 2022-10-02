package array;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(n / 10);
        System.out.println(n % 10);
        System.out.println(reverseInteger(n));
    }


    public static int reverseInteger(int n) {
        int input = n;
        int reverse = 0;
        while (input > 0) {
            int reminder = input % 10;
            input = input / 10;
            reverse = reverse * 10 + reminder;

        }
        return reverse;
    }

}
