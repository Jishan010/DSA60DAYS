package array.Imp;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {

        /*
         * Formula to calculate trap water is
         *
         * result = Math.min(leftMax,rightMax) - currentHeight
         *
         */

        int[] prefixMax = new int[height.length];
        int[] postfixMax = new int[height.length];
        for (int i = 1; i < height.length; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i - 1]);
        }

        for (int i = height.length - 2; i >= 0; i--) {
            postfixMax[i] = Math.max(postfixMax[i + 1], height[i + 1]);
        }

        int result = 0;
        for (int i = 0; i < height.length - 1; i++) {
            int waterLevel = Math.min(prefixMax[i], postfixMax[i]);
            if (waterLevel >= height[i])
                result += waterLevel - height[i];
        }

        return result;
    }


}
