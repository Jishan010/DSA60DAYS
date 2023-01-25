package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllSubsequences {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        //int[] out = new int[arr.length];
        List<Integer> result = new ArrayList<>();
        List<Integer> output = subSequencesForTargetSum(0, result, 0, arr, 2);
        System.out.println(output);
    }

    public static void printSubSequences(int index, int[] outArray, int[] inArr) {

        if (index >= inArr.length) {
            System.out.println(Arrays.toString(outArray));
            return;
        }

        //take or pick the particular index into the subsequence
        outArray[index] = inArr[index];
        printSubSequences(index + 1, outArray, inArr);

        //not pick or not take condition, this element is not added to your subsequent
        outArray[index] = 0;
        printSubSequences(index + 1, outArray, inArr);
    }

    //program to get the subsequence who's some is equal to target sum
    // for ex arr = {1,2,1} , targetSum = 2  Output = {1,1} and {2}
    public static List<Integer> subSequencesForTargetSum(int index, List<Integer> arrayList, int sum, int[] arr, int targetSum) {

        if (index == arr.length) {
            //limit reached : print the result
            if (sum == targetSum) {
                return arrayList;
            }
            return arrayList;
        }

        //take or pick particular index into the subsequence
        arrayList.add(arr[index]);
        sum += arr[index];
        subSequencesForTargetSum(index + 1, arrayList, sum, arr, targetSum);
        sum -= arr[index];
        arrayList.remove(arrayList.size() - 1);
        //remove or do not pick condition, this element is not added to your subsequent
        subSequencesForTargetSum(index + 1, arrayList, sum, arr, targetSum);

        return arrayList;
    }

}
