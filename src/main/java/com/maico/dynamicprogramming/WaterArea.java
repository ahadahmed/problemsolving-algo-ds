package com.maico.dynamicprogramming;

/**
 * @author ahadahmed
 * @see <a href="https://www.algoexpert.io/questions/Water%20Area"> see this</a>
 */


public class WaterArea {
    // time: O(n) || space: O(n)
    public int waterArea(int[] heights) {
        int[] max = new int[heights.length];
        int leftMax = 0;
        for (int i = 0; i < heights.length; i++) {
            max[i] = leftMax;
            leftMax = Math.max(leftMax, heights[i]);
        }
        int rightMax = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            rightMax = Math.max(rightMax, heights[i]);
            leftMax = max[i];
            int minHeight = Math.min(leftMax, rightMax);
            if(heights[i] < minHeight){
                max[i] = minHeight - heights[i];
            }else {
                max[i]  = 0;
            }
        }
        int sum = 0;
        for (int i = 0; i < max.length; i++) {
            sum += max[i];
        }
        return sum;
    }
}
