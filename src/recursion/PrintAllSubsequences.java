package recursion;

import java.util.Arrays;

public class PrintAllSubsequences {


    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        int[] out = new int[arr.length];
        printSubSequences(0, out, arr);
    }

    public static void printSubSequences(int index, int[] outArray, int[] inArr) {

        if (index >= inArr.length) {
            System.out.println(Arrays.toString(outArray));
            return;
        }

        //add the given index : for taking the given value
        outArray[index] = inArr[index];
        printSubSequences(index + 1, outArray, inArr);

        //remove the added array  : for not taking the given value
        outArray[index] = 0;
        printSubSequences(index + 1, outArray, inArr);
    }
}
