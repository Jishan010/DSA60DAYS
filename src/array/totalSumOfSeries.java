package array;

public class totalSumOfSeries {
    public static void main(String[] args) {
        System.out.println(getTotalSumFromSeries(3));
    }

    public static int getTotalSumFromSeries(int n) {
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += i;
        }
        return totalSum;
    }
}
