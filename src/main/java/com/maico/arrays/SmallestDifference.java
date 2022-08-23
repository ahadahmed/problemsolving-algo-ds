package com.maico.arrays;


import java.util.Arrays;

/**
 * <p>
 * Write a function that takes in two non-empty arrays of integers, finds the
 * pair of numbers (one from each array) whose absolute difference is closest to
 * zero, and returns an array containing these two numbers, with the number from
 * the first array in the first position.
 * </p>
 *
 * <p>
 * Note that the absolute difference of two integers is the distance between
 * them on the real number line. For example, the absolute difference of -5 and 5
 * is 10, and the absolute difference of -5 and -4 is 1.
 * </p>
 *
 * <p>
 * You can assume that there will only be one pair of numbers with the smallest
 * difference.
 * </p>
 *
 * <div>
 * <b>SAMPLE INPUT:</b>
 *     <pre>
 *      <span>arrayOne</span> = {-1, 5, 10, 20, 28, 3}
 *      <span>arrayTwo</span> = {26, 134, 135, 15, 17}
 *     </pre>
 * </div>
 * <div>
 *  <b>SAMPLE OUTPUT:</b>
 *      <pre>
 *          <span>output = {28, 26} </span>
 *      </pre>
 * </div>
 *
 * @author ahadahmed
 * @see <a href="https://www.algoexpert.io/questions/smallest-difference">see this</a>
 * @apiNote TimeComplexity: O( nlog(n)) + mlog(m) )
 */

public class SmallestDifference {

    /**
     * @param arrayOne first input array.
     * @param arrayTwo second input array.
     * @apiNote TimeComplexity: O( nlog(n)) + mlog(m) ) - where n and m is the length of <div>SpaceComplexity: O(1)</div>
     * <pre>arrayOne</pre> and <pre>arrayTwo</pre>
     * @return result array of length two, containing the numbers whose absolute difference is minimum.
     */

    public int[] findSmallestDifference(int[] arrayOne, int[] arrayTwo) {

        int[] result = new int[2];
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int arrayOnePointer = 0;
        int arrayTwoPointer = 0;
        int smallestDifference = Integer.MAX_VALUE;
        while (arrayOnePointer < arrayOne.length && arrayTwoPointer < arrayTwo.length) {
            int arrayOneItem = arrayOne[arrayOnePointer];
            int arrayTwoItem = arrayTwo[arrayTwoPointer];

            if(arrayOneItem == arrayTwoItem){
                result[0] = arrayOneItem;
                result[1] = arrayTwoItem;
                return result;
            }

            int absoluteDifference = Math.abs(arrayOneItem - arrayTwoItem);
            if(absoluteDifference < smallestDifference){
                smallestDifference = absoluteDifference;
                result[0] = arrayOneItem;
                result[1] = arrayTwoItem;
            }
            if(arrayOneItem < arrayTwoItem){
                arrayOnePointer++;
            }
            if(arrayTwoItem < arrayOneItem){
                arrayTwoPointer++;
            }

        }

        return result;
    }
}
