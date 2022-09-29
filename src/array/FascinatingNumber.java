package array;

import java.util.Arrays;

public class FascinatingNumber {
    public static void main(String[] args) {
        boolean fascinatingValue = fascinatingNumberOrNot(853);
        System.out.println(fascinatingValue);
    }

    public static boolean fascinatingNumberOrNot(int n) {
        //step 1 : convert to Fascinating value as string and concat by multiplying by 2 and 3
        String stringValue = "" + n + "" + n * 2 + "" + n * 3;
        System.out.println(stringValue);

        //step 2 : convert into array
        char[] arr = stringValue.toCharArray();

        //step 3 : sort the above array in ascending manner
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(String.valueOf(arr[i])) != i + 1)
                return false;
        }
        return true;
    }

}
