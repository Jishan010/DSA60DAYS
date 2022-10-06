package array;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] inputMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(transpose(inputMatrix)));

        int[][] inputMatrix2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(transpose(inputMatrix2)));
    }

    public static int[][] transpose(int[][] matrix) {

        int[][] newMatrix = new int[matrix[0].length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                newMatrix[col][row] = matrix[row][col];
            }
        }

        return newMatrix;
    }


}
