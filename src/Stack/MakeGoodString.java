package Stack;

import java.util.Stack;

public class MakeGoodString {

    public static void main(String[] args) {
        String s = "leEeetcode";
        makeGood(s);
    }

    public static String makeGood(String s) {
        // Use stack to store the visited characters.
        Stack<Character> stack = new Stack<>();

        // Iterate over 's'.
        for (char currChar : s.toCharArray()) {
            // If the current character make a pair with the last character in the stack,
            // remove both of them. Otherwise, we the add current character to stack.

            // remaining value of ASCII of small letter and capital value is always 32 , hence one of them is small and capital pair
            if (!stack.isEmpty() && Math.abs(stack.lastElement() - currChar) == 32)
                stack.pop();
            else
                stack.add(currChar);
        }

        // Returns the string concatenated by all characters left in the stack.
        StringBuilder ans = new StringBuilder();
        for (char currChar : stack)
            ans.append(currChar);
        return ans.toString();
    }
}
