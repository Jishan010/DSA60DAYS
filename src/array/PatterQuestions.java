package array;

public class PatterQuestions {
    public static void main(String[] args) {
        /*printStarts(5);*/
        printMatrix2(6);
    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void printStarts(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * *
     * * *
     * * * *
     * * * * *
     */
    public static void printMatrix(int n) {

        for (int row = 1; row <= n; row++) {

            //loop to print empty space
            for (int col1 = n; col1 > row; col1--) {
                System.out.print(" " + " ");
            }

            //loop to print empty space
            for (int col2 = 1; col2 <= row; col2++) {
                System.out.print("*" + " ");
            }

            System.out.println();

        }

    }


    /**
     * print below pattern
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     *
     * @param n
     */
    public static void printMatrix2(int n) {
        //outer most for loop is for number of rows
        for (int row = 1; row <= n; row++) {
            //this for loop is for printing spaces
            for (int col1 = 0; col1 < n - row; col1++) {
                System.out.print(" ");
            }

            //this for loop is for printing stars
            for (int col2 = 0; col2 < row; col2++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


}
