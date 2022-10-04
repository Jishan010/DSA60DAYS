package array;

/**
 * LeetCode 771 Jewels and Stones
 */
public class JwelsAndStones {
    public static void main(String[] args) {

        String jewels = "z";
        String stones = "ZZ";

        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        char[] jew = jewels.toCharArray();
        char[] stn = stones.toCharArray();
        int matchingCount = 0;

        for (int i = 0; i < jew.length; i++) {
            for (int j = 0; j < stn.length; j++) {
                if (jew[i] == stn[j]) {
                    matchingCount++;
                }
            }
        }
        return matchingCount;
    }
}
