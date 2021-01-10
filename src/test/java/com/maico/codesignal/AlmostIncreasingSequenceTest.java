package com.maico.codesignal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlmostIncreasingSequenceTest {

    @Test
    void almostIncreasingSequence() {

        int[] input = {1, 2, 3, 4, 5, 3, 5, 6};
        boolean result = AlmostIncreasingSequence.almostIncreasingSequence(input);
        System.out.println(result);
        Assertions.assertEquals(false, result);
    }

    @Test
    void almostIncreasingSequence2() {

        int[] input = {40, 50, 60, 10, 20, 30};
        boolean result = AlmostIncreasingSequence.almostIncreasingSequence(input);
        System.out.println(result);
        Assertions.assertEquals(false, result);
    }

    @Test
    void almostIncreasingSequence3() {

        int[] input = {1, 2, 1, 2};
        boolean result = AlmostIncreasingSequence.almostIncreasingSequence(input);
        System.out.println(result);
        Assertions.assertEquals(false, result);
    }

    @Test
    void almostIncreasingSequence4() {

        int[] input = {10, 1, 2, 3, 4, 5, 6};
        boolean result = AlmostIncreasingSequence.almostIncreasingSequence(input);
        System.out.println(result);
        Assertions.assertEquals(true, result);
    }



}
