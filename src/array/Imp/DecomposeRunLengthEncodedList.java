package array.Imp;

import java.util.Arrays;

public class DecomposeRunLengthEncodedList {

    public static void main(String[] args) {
       /* int[] arr = {4, 2, 6, 4};
        System.out.println(Arrays.toString(decompressRLElist(arr)));*/

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(decompressRLElist(arr1)));
    }

    //4 2 6 4
    public static int[] decompressRLElist(int[] nums) {
        int resultArraySize = 0;

        for (int i = 0; i < nums.length; i += 2) {
            resultArraySize += nums[i];
        }

        int[] resultArray = new int[resultArraySize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(resultArray, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return resultArray;
    }


}
