package array;

public class ReverseCharArray {

    public static void main(String[] args) {

        char[] chars={'J','s','h','a','n'};;
        System.out.print(reverseCharArray(chars));
    }


    private static char[] reverseCharArray(char[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

}
