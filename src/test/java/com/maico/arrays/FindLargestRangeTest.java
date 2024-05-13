package com.maico.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLargestRangeTest {
    private FindLargestRange findLargestRange;

    @BeforeEach
    void setUp() {
        findLargestRange = new FindLargestRange();
    }

    @Test
    void largestRange() {
        int[] input =  {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        int[] expected = {0,7};
        int[]  actual = findLargestRange.largestRange(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void largestRange2() {
        int[] input = {0, 9, 19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 1};
        int[] expected = {-1,13};
        int[]  actual = findLargestRange.largestRange(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void largestRange3() {
        int[] input = {1};
        int[] expected = {1,1};
        int[]  actual = findLargestRange.largestRange(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void largestRange4() {
        int[] input = {0};
        int[] expected = {0,0};
        int[]  actual = findLargestRange.largestRange(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void largestRange5() {
        int[] input = {0};
        int[] expected = {0,0};
        int[]  actual = findLargestRange.largestRange(input);
        assertArrayEquals(expected, actual);
    }
}