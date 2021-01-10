package com.maico.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumLeetcodeTest {

    @Test
    void twoSum() {

        int[] input = {-2, 7, 11, 15};
        int target = 5;
        int[] expected = {0,1};

        int[] actual = TwoSumLeetcode.twoSum(input, target);

        Assertions.assertArrayEquals(expected, actual);

        System.out.println(Arrays.toString(actual));

    }

    @Test
    void twoSum2() {

        int[] input = {3,2,95,4,-3};

        int target = 92;
        int[] expected = {2,4};

        int[] actual = TwoSumLeetcode.twoSum(input, target);

        Assertions.assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(actual));

    }
}
