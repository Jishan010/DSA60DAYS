package Stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

    public static void main(String[] args) {
        int[] asteroids = {-5, 4, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int element : asteroids) {
            if (element > 0) {
                stack.push(element);
            } else {// i is negative
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(element)) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(element)) {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.peek() > Math.abs(element)) {
                    //do nothing
                } else {
                    stack.push(element);
                }
            }
        }
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }

}
