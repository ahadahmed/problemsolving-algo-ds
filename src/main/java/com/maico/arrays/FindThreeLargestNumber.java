package com.maico.arrays;

/**
 * @author ahadahmed - 2/17/21
 * @see <a href="https://www.algoexpert.io/questions/Find%20Three%20Largest%20Numbers"> see this</a>
 */
public class FindThreeLargestNumber {

    public int[] findThreeLargestNUmber(int[] array) {
        int[] result = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int i = 0; i < array.length; i++) {
            int temp;
            if (array[i] >= result[2]) {
                temp = result[2];
                result[2] = array[i];
                result[0] = result[1];
                result[1] = temp;
                continue;
            } else if (array[i] >= result[1] && array[i] < result[2]) {
                temp = result[1];
                result[1] = array[i];
                result[0] = temp;
                continue;
            } else if (array[i] >= result[0] && array[i] < result[1]) {
                result[0] = array[i];

            }
        }

        return result;
    }
}
