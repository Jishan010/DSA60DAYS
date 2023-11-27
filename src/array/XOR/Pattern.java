package array.XOR;


public class Pattern {

    public static void main(String[] args) {
        int target = 5;
        for (int row = 0; row < target; row++) {
            int spaceCount = target - (row + 1);
            for (int col = 0; col < target; col++) {
                if (spaceCount > 0) {
                    System.out.print(" ");
                    spaceCount--;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}        
