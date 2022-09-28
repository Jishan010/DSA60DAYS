package array;

import java.util.ArrayList;

public class FindLastRemainingValue {

    public static void main(String[] args) {
        int[] array = {8, 1, 2, 9, 4, 3, 7, 5};
        System.out.println(findTheRemainingValue(8, array));
    }

    public static int findTheRemainingValue(int n, int[] array) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integerArrayList.add(array[i]);
        }

        for (int i = 0; i < n; i++) {
            if (integerArrayList.size() == 1)
                return integerArrayList.get(0);
            else {
                if (i % 2 == 0) {
                    removeMaxElement(integerArrayList);
                } else
                    removeMinElement(integerArrayList);
            }
        }
        return -1;
    }

    private static void removeMinElement(ArrayList<Integer> integerArrayList) {
        int minValue = Integer.MAX_VALUE;
        int indexOfMinValue = 0;
        for (int i = 0; i < integerArrayList.size(); i++) {
            if (integerArrayList.get(i) < minValue) {
                minValue = integerArrayList.get(i);
                indexOfMinValue = i;
            }
        }
        integerArrayList.remove(indexOfMinValue);
    }

    private static void removeMaxElement(ArrayList<Integer> integerArrayList) {
        int maxValue = Integer.MIN_VALUE;
        int indexOfMaxValue = 0;
        for (int i = 0; i < integerArrayList.size(); i++) {
            if (integerArrayList.get(i) > maxValue) {
                maxValue = integerArrayList.get(i);
                indexOfMaxValue = i;
            }
        }
        integerArrayList.remove(indexOfMaxValue);
    }

}
