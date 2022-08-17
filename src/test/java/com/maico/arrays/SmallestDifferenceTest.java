package com.maico.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SmallestDifferenceTest {

    private SmallestDifference smallestDifference;

    @BeforeAll
    public void init(){
        smallestDifference = new SmallestDifference();
    }

    @Test
    void findSmallestDifference1() {
        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};
        int[] expectedResult = {28, 26};
        int[] actualResult = smallestDifference.findSmallestDifference(arrayOne, arrayTwo);

        assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    void findSmallestDifference2() {
        int[] arrayOne = {10, 0, 20, 25};
        int[] arrayTwo = {1005, 1006, 1014, 1032, 1031};
        int[] expectedResult = {25, 1005};
        int[] actualResult = smallestDifference.findSmallestDifference(arrayOne, arrayTwo);

        assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    void findSmallestDifference3() {
        int[] arrayOne = {0, 20};
        int[] arrayTwo = {21, -2};
        int[] expectedResult = {20, 21};
        int[] actualResult = smallestDifference.findSmallestDifference(arrayOne, arrayTwo);

        assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    void findSmallestDifference4() {
        int[] arrayOne = {0, 1};
        int[] arrayTwo = {0, 0};
        int[] expectedResult = {0, 0};
        int[] actualResult = smallestDifference.findSmallestDifference(arrayOne, arrayTwo);

        assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    void findSmallestDifference5() {
        int[] arrayOne = {10};
        int[] arrayTwo = {0};
        int[] expectedResult = {10, 0};
        int[] actualResult = smallestDifference.findSmallestDifference(arrayOne, arrayTwo);

        assertArrayEquals(expectedResult, actualResult);

    }
}