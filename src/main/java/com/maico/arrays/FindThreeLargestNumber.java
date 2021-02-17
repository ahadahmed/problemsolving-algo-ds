package com.maico.arrays;

/**
 * @author ahadahmed - 2/17/21
 * @see <a href="https://www.algoexpert.io/questions/Find%20Three%20Largest%20Numbers"> see this</a>
 */
public class FindThreeLargestNumber {

    public int[] findThreeLargestNUmber(int[] array) {
        int[] result = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int value : array) {
            int temp;
            if (value >= result[2]) {
                temp = result[2];
                result[2] = value;
                result[0] = result[1];
                result[1] = temp;
            } else if (value >= result[1]) {
                temp = result[1];
                result[1] = value;
                result[0] = temp;
            } else if (value >= result[0]) {
                result[0] = value;

            }
        }

        return result;
    }
}
