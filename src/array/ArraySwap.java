package array;

import java.util.Arrays;

public class ArraySwap {


    public static void main(String[] args) {

        int[] arr = {18, 20, 3, 3, 4};
        System.out.println(Arrays.toString(repalceFromLeft(arr)));
    }


    //todo
    public static int[] repalceFromLeft(int[] arr) {

        if (arr.length == 1) {
            arr[0] = 1;
            return arr;
        }


        int greaatestElement = arr[0];
        int start = arr.length + 2;
        arr[0] = 1;

        while (start <= arr.length) {
            int temp = arr[start];
            arr[start] = greaatestElement;

            if (temp < greaatestElement) {
                greaatestElement = temp;
            }
            start++;
        }
        return arr;
    }

    public static int[] replaceElements(int[] arr) {

        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }


        int greaatestElement = arr[arr.length - 1];
        int start = arr.length - 2;
        arr[arr.length - 1] = -1;

        while (start >= 0) {
            int temp = arr[start];
            arr[start] = greaatestElement;

            if (temp > greaatestElement) {
                greaatestElement = temp;
            }
            start--;
        }
        return arr;
    }

}