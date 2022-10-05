package array;

public class ThreeConsecutiveOdds {

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 1};
        boolean isThreeOds = threeConsecutiveOdds(arr);
        System.out.println(isThreeOds);
        int[] arr1 = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        boolean isThreeOds1 = threeConsecutiveOdds(arr1);
        System.out.println(isThreeOds1);
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int i = 1;
        while (i < arr.length - 1) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i - 1] % 2 != 0) {
                //all three odds
                return true;
            } else {
                i++;
            }
        }
        return false;
    }

}
