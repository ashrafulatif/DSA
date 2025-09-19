public class TrappingRainWater {

    // brute force approach
    public static int trapBrute(int[] height) {

        int n = height.length;
        int maxTrapWater = 0;

        for (int i = 0; i < n; i++) {

            int lMax = 0, rMax = 0;

            // find the left max
            for (int l = 0; l <= i; l++) {
                lMax = Math.max(lMax, height[l]);
            }
            // find the rightmax
            for (int r = i; r < n; r++) {
                rMax = Math.max(rMax, height[r]);
            }

            // calc the water area
            int waterArea = Math.min(lMax, rMax) - height[i];

            if (waterArea > 0)
                maxTrapWater += waterArea;

        }

        return maxTrapWater;
    }

    public static int trap(int[] height) {

        int n = height.length;
        int maxTrapWater = 0;

        int lMax[] = new int[n];
        int rMax[] = new int[n];

        // find the left max
        lMax[0] = height[0];
        for (int l = 1; l < n; l++) {
            lMax[l] = Math.max(lMax[l - 1], height[l]);
        }
        // find the rightmax
        rMax[n - 1] = height[n - 1];
        for (int r = n - 2; r >= 0; r--) {
            rMax[r] = Math.max(rMax[r + 1], height[r]);
        }

        for (int i = 0; i < n; i++) {
            // calc the water area
            int waterArea = Math.min(lMax[i], rMax[i]) - height[i];

            if (waterArea > 0)
                maxTrapWater += waterArea;

        }

        return maxTrapWater;
    }

    public static void main(String[] args) {

        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        System.out.println(trap(height));
    }
}