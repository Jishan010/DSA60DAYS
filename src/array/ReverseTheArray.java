package array;

import java.util.Arrays;

public class ReverseTheArray {


    public static void main(String[] args) {
        String soometext = "1234567";
        System.out.println(reverseString(soometext));
    }

    // optimised solutioon 1) Initialize start and end indexes as start = 0, end = n-1
    //2) In a loop, swap arr[start] with arr[end] and change start and end as follows :
    //start = start +1, end = end – 1
    private static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int startIndex = 0;
        int lastIndex = chars.length - 1;

        while (startIndex < lastIndex) {
            //swap element
            char temp = chars[startIndex];
            chars[startIndex] = chars[lastIndex];
            chars[lastIndex] = temp;

            startIndex++;
            lastIndex--;
        }
        return String.valueOf(chars);
    }

}
