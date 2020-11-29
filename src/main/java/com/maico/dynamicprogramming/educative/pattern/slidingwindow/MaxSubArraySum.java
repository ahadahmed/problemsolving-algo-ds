package com.maico.dynamicprogramming.educative.pattern.slidingwindow;

/**
 * @author ahadahmed - 11/29/20
 * @see <a href="#"> see this</a>
 */
public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] inputArray = new int[] { 2, 1, 5, 1, 3, 2 };
        int size = 3;
        System.out.println(maxSubArraySum(inputArray, size));
    }


    public static int maxSubArraySum(int[] inputArray, int numberCount){
        int maxSum =0;
        int windowStart = 0;
        int windowSum =0;

        for(int windowEnd=0; windowEnd<inputArray.length; windowEnd++){
            windowSum +=inputArray[windowEnd];
            if(windowEnd >= numberCount - 1){
                System.out.println("window sum:" + windowSum);
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= inputArray[windowStart];
                windowStart++;
            }
        }

        return maxSum;
    }
}
