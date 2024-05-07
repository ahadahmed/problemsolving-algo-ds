package com.maico.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPairToMatchTest {
    private FindPairToMatch findPairToMatch;

    @BeforeEach
    void setUp() {
        findPairToMatch = new FindPairToMatch();
    }

    @Test
    void findPairValues() {
        int matchValue = 10;
        int[] pairs = {3, 5, -4, 8, 11, 1, -1, 6};
        int[] expectedPair = {-1,11};
        assertArrayEquals(expectedPair, findPairToMatch.findPairValues(matchValue, pairs));
    }

    @Test
    void findPairValuesNLogN() {
        int matchValue = 10;
        int[] pairs = {3, 5, -4, 8, 11, 1, -1, 6};
        int[] expectedPair = {-1,11};
        assertArrayEquals(expectedPair, findPairToMatch.findPairValueNLogN(matchValue, pairs));
    }
}