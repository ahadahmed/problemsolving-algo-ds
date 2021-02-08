package com.maico.arrays;

import java.util.Arrays;

/**
 * <p>
 * Write a function that takes in an array of integers and returns an array of
 * length 2 representing the largest range of integers contained in that array.
 * </p>
 * <p>
 * The first number in the output array should be the first number in the range,
 * while the second number should be the last number in the range.
 * <p>
 * A range of numbers is defined as a set of numbers that come right after each
 * other in the set of real integers. For instance, the output array
 * <span>[2, 6]</span>  represents the range <span>{2, 3, 4, 5, 6}</span>
 *
 * <p>, which
 * is a range of length 5. Note that numbers don't need to be sorted or adjacent
 * in the input array in order to form a range.
 * </p>
 *
 * <h3>Sample Input</h3>
 * <pre>
 *     array = [1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6]
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>
 *     array = [0, 7]
 * </pre>¬
 *
 * @author ahadahmed - 2/7/21
 * @see <a href="#"> see this</a>
 */
public class LargestRange {


    public int[] largestRange(int[] array) {
        int[] result = new int[2];
        int rangeLeftIndex = 0;
        int rangeRightIndex = 0;
        int largestRange = Integer.MIN_VALUE;
        Arrays.sort(array);
//        [19, -1, 18, 2, 10, 3, 12, 5, 16, 4, 11, 8, 17, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14];
        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i-1]){
                continue;
            }

            if (array[i] == array[i - 1] + 1) {
                rangeRightIndex = i;
            } else {
                rangeLeftIndex = i;

            }

            if (rangeRightIndex - rangeLeftIndex > largestRange) {
                largestRange = Math.max(largestRange, rangeRightIndex - rangeLeftIndex);
                result[0] = array[rangeLeftIndex];
                result[1] = array[rangeRightIndex];
            }

        }

        if (largestRange < 0) {
            return new int[]{array[0], array[0]};
        }


        return result;
    }
}
