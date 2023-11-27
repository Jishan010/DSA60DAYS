package array;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        /*int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(nums)));*/

        int[] nums1 = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(nums1)));
    }

    public static int[] plusOne(int[] digits) {
        int carry = 0;
        int plusOne = 1;
        for(int i = digits.length-1 ; i >= 0 ; i--){
            if(digits[i] == 9){
                digits[i]=0;
                carry = 1;
            }  else if(carry == 1){
                digits[i]=digits[i]+1+carry;
                carry = 0;
            }else {
                digits[i]=digits[i]+plusOne;
                plusOne = 0;
            }

        }

        if(carry == 1){
            int[] nums = new int[digits.length+1];
            nums[0]=1;
            for(int i = 1; i < digits.length; i++){
                nums[i]=digits[i];
            }
            return nums;
        }

        return digits;
    }

  /*  public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }

        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }*/
}
