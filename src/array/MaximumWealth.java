package array;

/**
 * 1672 Richest Customer Wealth
 * https://leetcode.com/problems/richest-customer-wealth/submissions/814644225/
 */
public class MaximumWealth {
    public static void main(String[] args) {
        int[][] array = {
                {4, 7, 9},
                {2, 3},
                {23, 99, 103}

        };
        System.out.println(maximumWealth(array));
    }

    public static int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        int totalWealth = 0;
        for (int row = 0; row < accounts.length; row++) {

            for (int col = 0; col < accounts[row].length; col++) {
                totalWealth += accounts[row][col];
            }

            if (totalWealth > maximumWealth) {
                maximumWealth = totalWealth;
            }

            totalWealth = 0;
        }
        return maximumWealth;
    }
}
