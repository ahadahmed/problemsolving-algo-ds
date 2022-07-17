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
    @DisplayName("return valid array [0,1] for input {-2, 7, 11, 15}")
    void twoSum() {

        int[] input = {-2, 7, 11, 15};
        int target = 5;
        int[] expected = {0,1};

        int[] actual = underTest.findNumbersThatSumsUpTarget(input, target);

        Assertions.assertArrayEquals(expected, actual);

        System.out.println(Arrays.toString(actual));

    }

    @Test
    @DisplayName("return valid array [2,4] for input {3,2,95,4,-3}")
    void twoSum2() {

        int[] input = {3,2,95,4,-3};

        int target = 92;
        int[] expected = {2,4};

        int[] actual = underTest.findNumbersThatSumsUpTarget(input, target);

        Assertions.assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(actual));

    }
    @DisplayName("test empty array")
    @Test
    void testEmptyInputArray(){
        int[] input = {};
        int target = 5;
        int[] actual = underTest.findNumbersThatSumsUpTarget(input, target);
        Assertions.assertArrayEquals(input, actual);
    }

    @DisplayName("Input array contains single element that is equal to target sum")
    @Test
    void testInputArrayContainSingleElement(){
        int[] input = {5};
        int target = 5;
        int[] expected = {0};
        int[] actual = underTest.findNumbersThatSumsUpTarget(input, target);
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected, actual);
    }
}
