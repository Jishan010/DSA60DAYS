package array;

public class PrintMattrix {
    public static void main(String[] args) {
        /*printStarts(5);*/
        printMatrix(5);
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
                    System.out.print("*"+ " ");
            }

            System.out.println();

        }


    }


}
