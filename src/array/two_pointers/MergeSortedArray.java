package array.two_pointers;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && nums1.length == 1) {
            nums1[0] = nums2[0];
        } else {
            int p1 = m - 1;
            int p2 = n - 1;
            int p3 = m + n - 1;

            while (p1 >= 0 && p2 >= 0) {
                if (nums1[p1] >= nums2[p2]) {
                    nums1[p3] = nums1[p1];
                    p1--;
                    p3--;
                } else {
                    nums1[p3] = nums2[p2];
                    p2--;
                    p3--;
                }
            }

            while (p2 >= 0) { //only need to combine with remaining nums2, if any
                nums1[p3] = nums2[p2];
                p2--;
                p3--;
            }
        }
    }
}


