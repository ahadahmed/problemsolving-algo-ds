package com.maico.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindFirstDuplicateValueTest {
    private  FindFirstDuplicateValue findFirstDuplicateValue;

    @BeforeEach
     void init() {
        findFirstDuplicateValue = new FindFirstDuplicateValue();
    }

    @Test
    @DisplayName("return fist duplicate value(5) when there's duplicate")
    void firstDuplicateValue1() {
        int[] inputArray = {1, 2, 3, 4, 5, 5, 5, 6, 6, 7};
        int expectedResult = 5;
        int actualResult = findFirstDuplicateValue.firstDuplicateValue(inputArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("return -1 when there's no  duplicate value in the argument")
    void firstDuplicateValue2() {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int expectedResult = -1;
        int actualResult = findFirstDuplicateValue.firstDuplicateValue(inputArray);
        assertEquals(expectedResult, actualResult);
    }
}