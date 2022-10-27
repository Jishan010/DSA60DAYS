package array.two_pointers;

public class RemoveElement {

    public static void main(String[] args) {
        /*int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int answer = removeElement(nums, val);*/

        int[] nums = {3, 3};
        int val = 3;
        int answer = removeElement(nums, val);
        System.out.println(answer);
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 1) {
            if (nums[0] == val) {
                nums[0] = 0;
                return nums.length - 1;
            }
            return nums.length;
        }

        int freqOfGivenNumber = 0;
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (nums[j] == val && nums[i] != val) {
                nums[j] = 0;
                j--;
                freqOfGivenNumber++;
            } else if (nums[j] == val && nums[i] == val) {
                nums[j] = 0;
                j--;
                freqOfGivenNumber++;
            } else if (nums[i] == val && nums[j] != val) {
                //swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                nums[j] = 0;
                i++;
                j--;
                freqOfGivenNumber++;
            } else {
                i++;
            }
        }
        return nums.length - freqOfGivenNumber;
    }

}
