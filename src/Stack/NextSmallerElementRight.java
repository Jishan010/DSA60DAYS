package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElementRight {


    public static void main(String[] args) {
        int[] exampleArray = {2, 5, 3, 7, 1, 5, 2, 6, 3, 1};
        int[] resultArray = nextSmallerElement(exampleArray, exampleArray.length);
        System.out.println(Arrays.toString(resultArray));
    }

    static int[] nextSmallerElement(int[] array, int n) {
        int[] result = new int[n];
        // Default initialization of Stack
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (stack.empty()) {
                result[i] = -1;
            } else if (array[i] > stack.peek()) {
                result[i] = stack.peek();
            } else {
                while (!stack.isEmpty() && stack.peek() >= array[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    result[i] = -1;
                } else if (array[i] > stack.peek()) {
                    result[i] = stack.peek();
                }
            }
            stack.add(array[i]);
        }
        return result;
    }

}
