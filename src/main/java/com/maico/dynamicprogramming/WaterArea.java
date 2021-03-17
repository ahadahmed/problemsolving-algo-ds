package com.maico.dynamicprogramming;

/**
 * @author ahadahmed
 * @see <a href="https://www.algoexpert.io/questions/Water%20Area"> see this</a>
 */
public class WaterArea {

    public int waterArea(int[] heights) {
        int[] maxLeftHeights = new int[heights.length];
        int leftMax = 0;
        maxLeftHeights[0] = 0;
        for (int i = 0; i < heights.length; i++) {
            maxLeftHeights[i] = leftMax;
            leftMax = Math.max(leftMax, heights[i]);
        }
        int[] maxRightHeights = new int[heights.length];
        int rightMax = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            maxRightHeights[i] = rightMax;
            rightMax = Math.max(rightMax, heights[i]);
        }
        int[] waterUnits = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            int minHeight = Math.min(maxLeftHeights[i], maxRightHeights[i]);
            if (heights[i] < minHeight) {
                waterUnits[i] = minHeight - heights[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < waterUnits.length; i++) {
            sum += waterUnits[i];
        }
        return sum;
    }
}
