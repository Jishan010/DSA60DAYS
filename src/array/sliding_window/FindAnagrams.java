package array.sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagrams {

    public static void main(String[] args) {
        String s = "abaacbabc";
        String p = "abc";
        findAnagrams(s, p);
    }

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> answer = new ArrayList<>();
        // work for putting counts of chars in p in a map
        char[] pChar = p.toCharArray();
        Map<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < pChar.length; i++) {

            if (map1.getOrDefault(pChar[i], 0) == 0) {
                map1.put(pChar[i], 1);
            } else {
                map1.put(pChar[i], map1.getOrDefault(pChar[i], 0) + 1);
            }
        }

        //code for sliding window
        char[] sChar = s.toCharArray();
        int k = pChar.length;
        int i = 0;
        int j = 0;

        Map<Character, Integer> map2 = new HashMap<>();

        while (j < sChar.length) {
            // add the jth element into map
            if (map2.getOrDefault(sChar[j], 0) == 0) {
                map2.put(sChar[j], 1);
            } else {
                map2.put(sChar[j], map2.getOrDefault(sChar[j], 0) + 1);
            }

            //check for window size
            int windowSize = j - i + 1;
            if (windowSize < k) {
                j++;
            } else if (windowSize == k) {
                //do the calucaltion here
                if (map1.equals(map2)) {
                    answer.add(i);
                }
                int count = map2.get(sChar[i]);
                if (count == 1) {
                    map2.remove(sChar[i]);
                } else {
                    map2.put(sChar[i], count - 1);
                }
                i++;
                j++;
            }

        }

        return answer;
    }

}
