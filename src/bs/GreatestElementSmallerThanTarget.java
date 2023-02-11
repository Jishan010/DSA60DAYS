package bs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GreatestElementSmallerThanTarget {


    public static void main(String[] args) {

      /*  int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 16, 34, 56, 67, 78};
        int resultElement = greaterElement(array2, 9);
        System.out.println(resultElement);*/
        boolean result = true;
        if(!false){
            System.out.println("if"+result);
        }else
        {
            System.out.println("else"+result);
        }


    }

    private static int greaterElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result = arr[mid];
                start = mid + 1;
            } else if (arr[mid] < target) {
                result = arr[mid];
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return result;
    }

}
