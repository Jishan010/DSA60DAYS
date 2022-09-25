package array;

public class CheckIFPalindrome {

    public static void main(String[] args) {
        String soometext = "nitin";
        System.out.println(reverseString(soometext));
        String soomtext2 = "382390";
        System.out.println(reverseString(soomtext2));
        String soomtext3 = "2";
        System.out.println(reverseString(soomtext3));
    }

    // optimised solutioon 1) Initialize start and end indexes as start = 0, end = n-1
    //2) In a loop, swap arr[start] with arr[end] and change start and end as follows :
    //start = start +1, end = end – 1
    private static Boolean reverseString(String str) {
        char[] chars = str.toCharArray();
        int startIndex = 0;
        int lastIndex = chars.length - 1;

        if (chars.length == 1)
            return true;

        while (startIndex < lastIndex) {
            //swap element
            if (chars[startIndex] != chars[lastIndex]) {
                return false;
            }
            startIndex++;
            lastIndex--;
        }
        return true;
    }


}
