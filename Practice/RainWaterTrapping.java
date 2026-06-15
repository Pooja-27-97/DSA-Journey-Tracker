public class RainWaterTrapping {
    public static int trapRainWater(int height[]) {
        //left most max value
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for(int i=1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //right modt max value
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length - 1];

        for(int i=height.length-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //finding trap water
        int trapWater = 0;
        for(int i=0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapWater += waterLevel - height[i];
        }
        return trapWater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped rain water: " + trapRainWater(height));
    }
}