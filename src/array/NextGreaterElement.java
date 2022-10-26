package array;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {

    public static void main(String[] args) {
      /*  int[] nums1 = {1, 3, 5, 2, 4};
        int[] nums2 = {6, 5, 4, 3, 2, 1, 7};
        nextGreaterElement(nums1, nums2);*/

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        nextGreaterElement(nums1, nums2);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums2[nums2.length - 1], -1);
        for (int i = 0; i < nums2.length - 1; i++) {
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[i] < nums2[j]) {
                    map.put(nums2[i], nums2[j]);
                    break;
                } else {
                    map.put(nums2[i], -1);
                }
            }
        }

        for (int j = 0; j < nums1.length; j++) {
            nums1[j] = map.get(nums1[j]);
        }
        return nums1;
    }

}
