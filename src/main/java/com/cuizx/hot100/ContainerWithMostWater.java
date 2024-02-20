package com.cuizx.hot100;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int mostWater = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int water = (j - i) * Math.min(height[j], height[i]);
                mostWater = Math.max(water, mostWater);
            }
        }

        return mostWater;
    }
}
