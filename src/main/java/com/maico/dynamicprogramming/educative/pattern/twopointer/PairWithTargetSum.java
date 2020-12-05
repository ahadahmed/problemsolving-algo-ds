package com.maico.dynamicprogramming.educative.pattern.twopointer;

import java.util.Arrays;

/**
 *
 * Statement: Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
 * Example Input: arr = [1,2,3,4,6] ; targetSum = 6;
 * Example Output: output=[2,4]
 * @author ahadahmed - 12/5/20
 * @see <a href="http://educative.io/courses/grokking-the-coding-interview/xog6q15W9GP"> see this</a>
 */
public class PairWithTargetSum {

    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,6};
        int[] inputArray1 = {2,5,9,11};
        int[] outputArray = findPairOfTargetSum(inputArray,6);
        int[] outputArray1 = findPairOfTargetSum(inputArray1, 11);
        System.out.println("Index: "+ Arrays.toString(outputArray));
        System.out.println("Value: [" + inputArray[outputArray[0]] + ", "+inputArray[outputArray[1]]+"]");
        System.out.println("Index: "+ Arrays.toString(outputArray1));
        System.out.println("Value: [" + inputArray1[outputArray1[0]] + ", "+inputArray1[outputArray1[1]]+"]");

    }


    public static int[] findPairOfTargetSum(int[] inputArray, int targetSum){
        int[] outputArray = new int[] {-1, -1};

        int leftPointer = 0;
        int rightPointer = inputArray.length - 1;

        while (leftPointer < rightPointer){
            int sum = inputArray[leftPointer] + inputArray[rightPointer];
            if(sum ==  targetSum){
                outputArray[0] = leftPointer;
                outputArray[1] = rightPointer;
                return outputArray;
            }

            if(sum > targetSum){
                rightPointer--;
            }else{
                leftPointer++;
            }
        }


        return outputArray;
    }
}
