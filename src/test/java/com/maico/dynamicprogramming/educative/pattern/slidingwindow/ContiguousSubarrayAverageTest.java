package com.maico.dynamicprogramming.educative.pattern.slidingwindow;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContiguousSubarrayAverageTest {

    @Test
    void averageOfContiguousSubArray_test1() {

        int[] inputArray = new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        int size = 5;

        List<Double> result = new ArrayList<>();
        Collections.addAll(result, new Double[]{2.2, 2.8, 2.4, 3.6, 2.8});

        assertEquals(result, ContiguousSubarrayAverage.averageOfContigiousSubArray(inputArray, size));
    }
}
