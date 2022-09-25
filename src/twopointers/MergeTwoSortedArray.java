package twopointers;

import java.util.ArrayList;


public class MergeTwoSortedArray {

    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<>();
        first.add(2);
        first.add(7);
        first.add(9);
        first.add(16);
        first.add(26);

        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(3);
        second.add(13);
        second.add(88);
        second.add(207);
        second.add(399);
        second.add(400);

        ArrayList<Integer> mergedList = merge(first, second);
        System.out.println(mergedList);
    }

    /**
     * Merge Sorted array with extra space i.e we used third array to store merged sorted array
     *
     * @param first
     * @param second
     * @return
     */
    public static ArrayList<Integer> merge(ArrayList<Integer> first, ArrayList<Integer> second) {
        int i = 0;
        int j = 0;
        int k = 0;
        ArrayList<Integer> third = new ArrayList<>();

        while (i < first.size() && j < second.size()) {
            if (first.get(i) > second.get(j)) {
                third.add(k, second.get(j));
                j++;
            } else {
                third.add(k, first.get(i));
                i++;
            }
            k++;
        }

        if (j > i) {
            while (j < second.size()) {
                third.add(k, second.get(j));
                j++;
                k++;
            }
        } else {
            while (i < first.size()) {
                third.add(k, first.get(i));
                i++;
                k++;
            }
        }
        return third;
    }
}
