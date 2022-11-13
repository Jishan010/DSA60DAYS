package Stack;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String s = "{{()}}[]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> parenthesis = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                parenthesis.push(c);
            } else if (parenthesis.empty()) {
                return false;
            } else {
                char top = parenthesis.pop();
                if (top == '(' && c == ')' ||
                        top == '{' && c == '}' ||
                        top == '[' && c == ']'
                ) {
                    //do nothing
                } else {
                    return false;
                }
            }
        }
        return parenthesis.isEmpty();
    }
}
