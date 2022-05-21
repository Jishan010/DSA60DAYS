package Stack;

import java.util.*;

/**
 * problem statement https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
 * <p>
 * Input:
 * N = 4, arr[] = [1 3 2 4]
 * Output:
 * 3 4 4 -1
 * Explanation:
 * In the array, the next larger element
 * to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ?
 * since it doesn't exist, it is -1.
 */
public class NextGreaterElement {


    public static void main(String[] args) {
        long[] exampleArray = {6, 8, 0, 1, 3};
        long[] resultArray = nearestGreaterElement(exampleArray, exampleArray.length);
        System.out.println(Arrays.toString(resultArray));
    }

    static long[] nearestGreaterElement(long[] array, int n) {
        // Creating an object of List interface
        // implemented by the ArrayList class
        long[] result = new long[n];
        // Default initialization of Stack
        Stack<Long> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (stack.empty()) {
                result[i] = -1L;
            } else if (array[i] < stack.peek()) {
                result[i]=stack.peek();
            } else {
                while (!stack.isEmpty() && stack.peek() < array[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    result[i] = -1L;
                } else if (array[i] < stack.peek()) {
                    result[i]=stack.peek();
                }
            }
            stack.add(array[i]);
        }
        return result;
    }

}
