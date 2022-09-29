package array;

import java.util.Arrays;

//class to remove two greatest element from unsorted array
public class removeTwoGreatestElement {
    public static void main(String[] args) {
        int[] arr = {2,8,7,1,5};
        findElementsExceptTwoGreaterElement(arr.length,arr);

        int[] arr1 = {7,-2,3,4,9,-1};
        findElementsExceptTwoGreaterElement(arr1.length,arr1);
    }

    public static void findElementsExceptTwoGreaterElement(int n, int[] arr) {
        //inbuilt function to sort an array
        Arrays.sort(arr);
        //print all elements except last two elements
        for (int i = 0; i < n-2; i++) {
            System.out.println(arr[i]);
        }
    }
}
