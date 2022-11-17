package Stack;

import javafx.util.Pair;

import java.util.Stack;

public class MaximumAreaOfHistogram {

    public static void main(String[] args) {
        int[] heingts = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heingts));
    }


    public static int largestRectangleArea(int[] heights) {

        // syntax for Java Pair System.out.println("The First value is :" +  new Pair<>(10, 1));


        // step 1 : calculate NSR array (Next Smalled Element to Right)
        int[] nsr = new int[heights.length];

        Stack<Pair<Integer, Integer>> nsrStack = new Stack();
        for (int i = heights.length - 1; i >= 0; i--) {

            if (nsrStack.isEmpty()) {
                nsr[i] = heights.length;
            } else if (!nsrStack.isEmpty() && heights[i] > nsrStack.peek().getKey()) {
                nsr[i] = nsrStack.peek().getValue();
            } else if (!nsrStack.isEmpty() && heights[i] <= nsrStack.peek().getKey()) {

                while (!nsrStack.isEmpty() && heights[i] <= nsrStack.peek().getKey()) {
                    nsrStack.pop();
                }

                if (nsrStack.isEmpty()) {
                    nsr[i] = heights.length;
                } else if (heights[i] > nsrStack.peek().getKey()) {
                    nsr[i] = nsrStack.peek().getValue();
                }

            }

            nsrStack.push(new Pair<>(heights[i], i));

        }


        // step 2 : calculate NSL array (Next Smalled Element to Left)
        int[] nsl = new int[heights.length];

        Stack<Pair<Integer, Integer>> nslStack = new Stack();
        for (int j = 0; j < heights.length; j++) {

            if (nslStack.isEmpty()) {
                nsl[j] = -1;
            } else if (!nslStack.isEmpty() && heights[j] > nslStack.peek().getKey()) {
                nsl[j] = nslStack.peek().getValue();
            } else if (!nslStack.isEmpty() && heights[j] <= nslStack.peek().getKey()) {

                while (!nslStack.isEmpty() && heights[j] <= nslStack.peek().getKey()) {
                    nslStack.pop();
                }

                if (nslStack.isEmpty()) {
                    nsl[j] = -1;
                } else if (heights[j] > nslStack.peek().getKey()) {
                    nsl[j] = nslStack.peek().getValue();
                }

            }

            nslStack.push(new Pair<>(heights[j], j));

        }

        //step 3 , calculate width for elements of heights[] using formula ( NSR- NSL -1 )
        int[] width = new int[heights.length];
        for (int k = 0; k < heights.length; k++) {
            width[k] = nsr[k] - nsl[k] - 1;
        }

        //step 4 : calculate area for elements of height using width array = heights[i] * width[i];
        int[] area = new int[heights.length];
        for (int l = 0; l < heights.length; l++) {
            area[l] = heights[l] * width[l];
        }

        //step 5 // return max area value from area[]

        int max = 0;
        for (int m = 0; m < heights.length; m++) {
            max = Math.max(max, area[m]);
        }


        return max;
    }


}
