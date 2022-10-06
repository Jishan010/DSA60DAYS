package array;

public class CheckStrictlyIncreasing {
    public static void main(String[] args) {

        int[] inputArray1 = {1, 2, 10, 5, 7};
        System.out.println(checkIfArrayIsStrictlyIncreasing(inputArray1));

        int[] inputArray2 = {1, 1, 1};
        System.out.println(checkIfArrayIsStrictlyIncreasing(inputArray2));
    }

    //pseudo code // check for optimised solution
    public static boolean checkIfArrayIsStrictlyIncreasing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int[] newArray = new int[arr.length - 1];
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    newArray[counter] = arr[j];
                    counter++;
                }
            }
            if (checkIfStrictlyIncreasing(newArray)) {
                return true;
            }
        }
        return false;
    }


    public static boolean checkIfStrictlyIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1] || arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
