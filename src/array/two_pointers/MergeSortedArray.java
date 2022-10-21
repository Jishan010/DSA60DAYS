package array.two_pointers;

public class MergeSortedArray {


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        if (nums1.length == 0) {
            //do nothing
        } else if (nums1.length == 1 && nums2.length == 1) {
            nums1[i] = nums2[j];
        } else if (nums1.length > 1 && nums2.length >= 1) {

            while (i < m && j < n) {

                if (nums1[i] == nums2[j]) {

                    i++;
                } else if (nums1[i] > nums2[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = temp;
                    j++;
                } else if (nums1[i] < nums2[j]) {
                    i++;
                }
            }
            int k = 0;
            while (i <= m) {
                nums1[i] = nums2[k];
                i++;
                k++;
            }

        }


    }
}


