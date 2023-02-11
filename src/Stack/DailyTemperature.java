package Stack;

import java.util.Arrays;
import java.util.Stack;


public class DailyTemperature {

    static class Pair {
        int index = -1;
        int value = -1;

        Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        int[] asteroids = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] answers = dailyTemperatures(asteroids);
        System.out.println(Arrays.toString(answers));
    }

    public static int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        Stack<Pair> stack = new Stack<>();
        for (int i = temp.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(new Pair(i, temp[i]));
                ans[i] = 0;
            } else {
                while (!stack.isEmpty() && stack.peek().value < temp[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    ans[i] = 0;
                } else {
                    Pair item = stack.peek();
                    ans[i] = item.index - i;
                }
                stack.push(new Pair(i, temp[i]));
            }
        }
        return ans;
    }
}
