package array;

public class PrintAllAsciiValue {

    public static void main(String[] args) {
        for (int i = 0; i <= 128; i++) {
            System.out.println(i + "->" + (char) i);
        }

        char[] arr = {'1', '9', '6', '9'};
        for (int j = 0; j < arr.length; j++) {
            int a = arr[j] - '0';
            System.out.println(a);
        }
    }
}
