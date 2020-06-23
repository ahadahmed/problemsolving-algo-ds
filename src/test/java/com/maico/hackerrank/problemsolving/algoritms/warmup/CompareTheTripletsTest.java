package com.maico.hackerrank.problemsolving.algoritms.warmup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompareTheTripletsTest {
    List<Integer> aliceInput = new ArrayList<>();
    List<Integer> bobInput = new ArrayList<>();


    @BeforeEach
    void setUp() {

        aliceInput.add(15);
        aliceInput.add(28);
        aliceInput.add(30);

        bobInput.add(99);
        bobInput.add(16);
        bobInput.add(8);
    }


    @Test
    void compareTriplets() {
        int[] expected = {2, 1};
        assertArrayEquals(expected, CompareTheTriplets.compareTriplets(aliceInput, bobInput));
    }
}