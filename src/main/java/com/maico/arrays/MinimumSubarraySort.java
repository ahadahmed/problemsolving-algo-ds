package com.maico.arrays;

/**
 * <p>Write a function that takes in an array of at least two integers and that
 * returns an array of the starting and ending indices of the smallest subarray
 * (in the input array that needs to be sorted in place in order for the entire
 * input array to be sorted (in ascending order).
 *
 * <h3>Sample Input</h3>
 * <pre>array = [1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19]</pre>
 * <h3>Sample Output</h3>
 * <pre>output = [3,9]</pre>
 * </p>
 *
 * @author ahadahmed - 2/7/21
 * @see <a href="https://www.algoexpert.io/questions/Subarray%20Sort"> see problem in AlgoExpert</a>
 */
public class MinimumSubarraySort {

    public int[] subarraySort(int[] array) {
        int[] result = {-1, -1};
        int minUnsorted = Integer.MAX_VALUE;
        int maxUnsorted = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (!isSorted(i, array[i], array)) {
                minUnsorted = Math.min(minUnsorted, array[i]);
                maxUnsorted = Math.max(maxUnsorted, array[i]);
            }
        }
        int leftIndex = 0;
        while (leftIndex < array.length - 1 && minUnsorted >= array[leftIndex]) {
            leftIndex++;
        }

        int rightIndex = array.length - 1;
        while (rightIndex >=0 && maxUnsorted <= array[rightIndex]){
            rightIndex--;
        }

        if(minUnsorted == Integer.MAX_VALUE){
            return result;
        }

        result[0] = leftIndex;
        result[1] = rightIndex;



        return result;
    }

    private boolean isSorted(int index, int number, int[] array) {

        if (index == 0) {
            return number <= array[index + 1];
        }

        if (index == array.length - 1) {
            return number >= array[index - 1];
        }

        return number >= array[index - 1] && number <= array[index + 1];
    }
}
