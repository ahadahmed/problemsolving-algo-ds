package com.maico.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LargestRangeTest {

    private static LargestRange largestRange;

    @BeforeAll
    static void init() {
        largestRange = new LargestRange();
    }

    @Test
    void largestRange() {
        int[] input = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        int[] expected = {0, 7};
        int[] output;
        System.out.println("input: " + Arrays.toString(input));
        System.out.println("expect: " + Arrays.toString(expected));
        output = largestRange.largestRange(input);
        System.out.println("output: " + Arrays.toString(output));
        Assertions.assertArrayEquals(expected, output);

    }


    @Test
    void largestRange1() {
        int[] input = {1, 11};
        int[] expected = {1, 1};
        int[] output;
        System.out.println("input: " + Arrays.toString(input));
        System.out.println("expect: " + Arrays.toString(expected));
        output = largestRange.largestRange(input);
        System.out.println("output: " + Arrays.toString(output));
        Assertions.assertArrayEquals(expected, output);

    }

    @Test
    void largestRange2() {
        int[] input = {1, 11, 12};
        int[] expected = {11, 12};
        int[] output;
        System.out.println("input: " + Arrays.toString(input));
        System.out.println("expect: " + Arrays.toString(expected));
        output = largestRange.largestRange(input);
        System.out.println("output: " + Arrays.toString(output));
        Assertions.assertArrayEquals(expected, output);

    }

    @Test
    void largestRange3() {
        int[] input = {19, -1, 18, 2, 10, 3, 12, 5, 16, 4, 11, 8, 17, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14};
        int[] expected = {10, 19};
        int[] output;
        System.out.println("input: " + Arrays.toString(input));
        System.out.println("expect: " + Arrays.toString(expected));
        output = largestRange.largestRange(input);
        System.out.println("output: " + Arrays.toString(output));
        Assertions.assertArrayEquals(expected, output);

    }

    @Test
    void largestRange4() {
        int[] input = {1, 1, 1, 3, 4};
        int[] expected = {3, 4};
        int[] output;
        System.out.println("input: " + Arrays.toString(input));
        System.out.println("expect: " + Arrays.toString(expected));
        output = largestRange.largestRange(input);
        System.out.println("output: " + Arrays.toString(output));
        Assertions.assertArrayEquals(expected, output);

    }

    @Test
    void largestRange5() {
        int[] input = {1};
        int[] expected = {1, 1};
        int[] output;
        System.out.println("input: " + Arrays.toString(input));
        System.out.println("expect: " + Arrays.toString(expected));
        output = largestRange.largestRange(input);
        System.out.println("output: " + Arrays.toString(output));
        Assertions.assertArrayEquals(expected, output);

    }

    @Test
    void largestRange6() {
        int[] input = {4,2,1,3};
        int[] expected = {1, 4};
        int[] output;
        System.out.println("input: " + Arrays.toString(input));
        System.out.println("expect: " + Arrays.toString(expected));
        output = largestRange.largestRange(input);
        System.out.println("output: " + Arrays.toString(output));
        Assertions.assertArrayEquals(expected, output);

    }






}
