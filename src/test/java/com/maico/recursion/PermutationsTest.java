package com.maico.recursion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    private static Permutations permutations;
    @BeforeAll
    static void init(){
        permutations = new Permutations();
    }

    @Test
    void getPermutations() {
        Integer[] array = {1,2,3};
        List<Integer> aList = Arrays.asList(array);
        permutations.permutations(aList);
    }

    @Test
    void getPermutations2() {
        Integer[] array = {1,2,3,4};
        List<Integer> aList = Arrays.asList(array);
        permutations.permutations(aList);
    }

    @Test
    void getPermutations3() {
        Integer[] array = {1,2,3,4,5};
        List<Integer> aList = Arrays.asList(array);
        permutations.permutations(aList);
    }

    @Test
    void getPermutations4() {
        Integer[] array = {1,2,3,4,5,6};
        List<Integer> aList = Arrays.asList(array);
        permutations.permutations(aList);
    }

    @Test
    void getPermutations5() {
        Integer[] array = {1,2,3,4,5,6,7,8};
        List<Integer> aList = Arrays.asList(array);
        permutations.permutations(aList);
    }

    @Test
    void getPermutationsEmpty() {
        Integer[] array = {};
        List<Integer> aList = Arrays.asList(array);
        permutations.permutations(aList);
    }
}