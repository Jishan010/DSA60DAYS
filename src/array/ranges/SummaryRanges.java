package array.ranges;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 4, 5, 7, 9, 10, 12, 14, 15, 16, 27, 28};
        summaryRanges(nums);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList();
        if (nums.length == 1) {
            list.add(nums[0] + "");
            return list;
        }
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            while (i + 1 < nums.length && (nums[i + 1] - nums[i]) == 1) {
                i++;
            }
            if (a != nums[i]) {
                list.add(a + "->" + nums[i]);
            } else {
                list.add(a + "");
            }
        }
        return list;
    }
}
