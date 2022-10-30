package array.ranges;

public class SummaryRanges {
    public static void main(String[] args) {


        int[] nums = {1, 1, 0, 1, 1, 1};
        findMaxConsecutiveOnes(nums);
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==1){
                count++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes,count) ;
            }else{
                count = 0;
            }
        }
        return maxConsecutiveOnes;
    }

    //todo using hashmap
  /*  public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        int listIndex = 0;

        while (j < nums.length) {
            if (nums[j] != nums[j + 1] - 1 || nums[i] == nums[j]) {
                result.add(listIndex, String.valueOf(nums[i]));
                i = j;
                j++;
                listIndex++;

            } else if (nums[j] == nums[j + 1] - 1) {
                result.add(listIndex, String.valueOf(nums[i]) + "->" + String.valueOf(nums[j]));
                j++;
            }
        }

        return result;
    }*/
}
