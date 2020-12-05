package com.maico.dynamicprogramming.educative.pattern.twopointer;

import java.util.Arrays;

/**
 * Given an array of sorted numbers, remove all duplicates from it(in place). You should not use any extra space
 * after removing the duplicates in-place return the length of the subarray that has no duplicate in it.
 * Example input: [2, 3, 3, 3, 6, 9, 9]
 * Output: 4
 * Example output array : [2,3,6,9]
 * @author ahadahmed - 12/5/20
 * @see <a href="https://www.educative.io/courses/grokking-the-coding-interview/mEEA22L5mNA"> see this</a>
 */
public class RemoveDuplicateFromArrayInPlace {

    public static void main(String[] args) {
        int[] inputArray1 = {2,3,3,6,9,9};
        int length = removeDuplicateInPlace(inputArray1);
        System.out.println(length);
        int[] resultArray = Arrays.copyOf(inputArray1, length);
        System.out.println(Arrays.toString(resultArray));
    }


    public static int removeDuplicateInPlace(int[] inputArray){
        int nextDistinctElementIndex = 1;
        for(int i=0; i<inputArray.length; i++){
            if(inputArray[i] != inputArray[nextDistinctElementIndex - 1]){
                inputArray[nextDistinctElementIndex] = inputArray[i];
                nextDistinctElementIndex++;
            }
        }
        return nextDistinctElementIndex;
    }
}
