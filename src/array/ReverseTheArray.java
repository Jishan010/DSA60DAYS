package array;

import java.util.Arrays;

public class ReverseTheArray {


    public static void main(String[] args) {
        String soometext = "1234567";
        System.out.println(reverseString(soometext));
    }

    /**
     * solving from simple loop // still not good solution as we are usign an extra space because we used extra array
     *
     * @param straigtString [String]
     */
    private static String reverseSubArray(String straigtString) {
        char[] chars = straigtString.toCharArray();
        char[] reversedArray = new char[chars.length];
        int j = 0;
        int i = chars.length - 1;
        while (i >= 0) {
            reversedArray[j] = chars[i];
            i--;
            j++;
        }
        return String.valueOf(reversedArray);
    }

    //todo view  optimised  solutionn


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
