package array.sliding_window;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem on sliding window
 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/
 */
public class CountGoodSubstrings {
    public static void main(String[] args) {

       /* boolean result = checkIfCharsAreGood('a', 'b', 'e');
        System.out.println(result);*/

        String s = "aababcabc";
        System.out.println(countGoodSubstrings(s));
    }

    // x y z z a z
    public static int countGoodSubstrings(String s) {
        int count = 0;
        int k = 3;

        char[] arr = s.toCharArray();

        int start = 0;
        int end = 0;

        while (end < arr.length) {
            int substringLength = end - start + 1;
            if (substringLength == k) {
                //function to chick if substring is good string
                boolean result = checkIfCharsAreGood(arr[start], arr[start + 1], arr[end]);
                if (result) {
                    count++;
                }
                start++;
                end++;
            } else {
                end++;
            }
        }
        return count;
    }

    public static boolean checkIfCharsAreGood(char a, char b, char c) {
        Set<Character> set = new HashSet<>();
        return set.add(a) && set.add(b) && set.add(c);
    }

}
