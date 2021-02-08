package com.maico.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class MinimumSubarraySortTest {

    private static MinimumSubarraySort minimumSubarraySort;

    @BeforeAll
    static void init() {
        minimumSubarraySort = new MinimumSubarraySort();
    }

    @Test
    void subarraySort() {
        int[] input = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        int[] expected = {3, 9};
        int[] out;
        System.out.println("InpArray: " + Arrays.toString(input));
        out = minimumSubarraySort.subarraySort(input);
        System.out.println("ExpArray: " + Arrays.toString(expected));
        System.out.println("OutArray: " + Arrays.toString(out));
        Assertions.assertArrayEquals(expected, out);
    }

    @Test
    void subarraySort1() {
        int[] input = {1, 1};
        int[] expected = {-1, -1};
        int[] out;
        System.out.println("InpArray: " + Arrays.toString(input));
        out = minimumSubarraySort.subarraySort(input);
        System.out.println("ExpArray: " + Arrays.toString(expected));
        System.out.println("OutArray: " + Arrays.toString(out));
        Assertions.assertArrayEquals(expected, out);
    }

    @Test
    void subarraySort2() {
        int[] input = {1, 0};
        int[] expected = {0, 1};
        int[] out;
        System.out.println("InpArray: " + Arrays.toString(input));
        out = minimumSubarraySort.subarraySort(input);
        System.out.println("ExpArray: " + Arrays.toString(expected));
        System.out.println("OutArray: " + Arrays.toString(out));
        Assertions.assertArrayEquals(expected, out);
    }

    @Test
    void subarraySort3() {
        int[] input = {1, 2, 4, 7, 10, 11, 12, 11, 16, 18, 19};
        int[] expected = {6, 7};
        int[] out;
        System.out.println("InpArray: " + Arrays.toString(input));
        out = minimumSubarraySort.subarraySort(input);
        System.out.println("ExpArray: " + Arrays.toString(expected));
        System.out.println("OutArray: " + Arrays.toString(out));
        Assertions.assertArrayEquals(expected, out);
    }

    @Test
    void subarraySort4() {
        int[] input = {8, 7, 6, 5, 4};
        int[] expected = {0, 4};
        int[] out;
        System.out.println("InpArray: " + Arrays.toString(input));
        out = minimumSubarraySort.subarraySort(input);
        System.out.println("ExpArray: " + Arrays.toString(expected));
        System.out.println("OutArray: " + Arrays.toString(out));
        Assertions.assertArrayEquals(expected, out);
    }


}
