package com.maico.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotatedSortedArraySearchTest {
    private static RotatedSortedArraySearch rotatedSortedArraySearch;

    @BeforeAll
    static void init(){
        rotatedSortedArraySearch = new RotatedSortedArraySearch();
    }

    @Test
    void search() {
        int[] inputArray = {45,61,71,72,73,0,1 ,21,33,45};
        System.out.println(Arrays.toString(inputArray));
        int target = 33;
        int expected = 8;
        int result = rotatedSortedArraySearch.search(inputArray, target);
        assertEquals(expected, result);

    }

    @Test
    void search2() {
        int[] inputArray = {45,61,71,72,73,0,1 ,21,33,45};
        System.out.println(Arrays.toString(inputArray));
        int target = 45;
        int expected = 0;
        int result = rotatedSortedArraySearch.search(inputArray, target);
        System.out.println(result);
        assertEquals(expected, result);

    }

    @Test
    void search3() {
        int[] inputArray = {45,61,71,72,73,0,1 ,21,33,45};
        System.out.println(Arrays.toString(inputArray));
        int target = 61;
        int expected = 1;
        int result = rotatedSortedArraySearch.search(inputArray, target);
        System.out.println(result);
        assertEquals(expected, result);

    }


    @Test
    void search4() {
        int[] inputArray = {45,61,71,72,73,0,1 ,21,33,45};
        System.out.println(Arrays.toString(inputArray));
        int target = 0;
        int expected = 5;
        int result = rotatedSortedArraySearch.search(inputArray, target);
        System.out.println(result);
        assertEquals(expected, result);

    }

    @Test
    void search5() {
        int[] inputArray = {45,61,71,72,73,0,1 ,21,33,45};
        System.out.println(Arrays.toString(inputArray));
        int target = 70;
        int expected = 5;
        int result = rotatedSortedArraySearch.search(inputArray, target);
        System.out.println(result);
        assertNotEquals(expected, result);

    }
}
