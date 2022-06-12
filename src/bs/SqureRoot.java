package bs;

public class SqureRoot {

    public static void main(String[] args) {
        int resultIndex2 = mySqrt(102);
        System.out.println(resultIndex2);

    }

    // 1 2 3 4


    public static int mySqrt(int x) {
        if (x == 0)
            return 0;

        int start = 1;
        int end = x;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2; // better way to get away from int limit overflow exception , instead of using (start + end) / 2
            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

}
