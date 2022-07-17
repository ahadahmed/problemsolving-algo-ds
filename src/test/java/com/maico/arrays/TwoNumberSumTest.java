package com.maico.arrays;

import org.junit.jupiter.api.*;

import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TwoNumberSumTest {
    private TwoNumberSum underTest;
    @BeforeAll
    void init(){
        underTest = new TwoNumberSum();
    }

    @Test
    @DisplayName("return valid array [0,1]")
    void twoSum() {

        int[] input = {-2, 7, 11, 15};
        int target = 5;
        int[] expected = {0,1};

        int[] actual = underTest.findNumbersThatSumsUpTarget(input, target);

        Assertions.assertArrayEquals(expected, actual);

        System.out.println(Arrays.toString(actual));

    }

    @Test
    @DisplayName("return valid array [2,4]")
    void twoSum2() {

        int[] input = {3,2,95,4,-3};

        int target = 92;
        int[] expected = {2,4};

        int[] actual = underTest.findNumbersThatSumsUpTarget(input, target);

        Assertions.assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(actual));

    }
}
