package com.maico.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private static BinarySearch binarySearch;

    @BeforeAll
    static void init(){
        binarySearch = new BinarySearch();
    }

    @Test
    void binarySearch() {
        int[] input = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        System.out.println(Arrays.toString(input));
        int target = 33;
        int expect = 3;
        int result = binarySearch.binarySearch(input, target);
        System.out.println(result);
        assertEquals(expect, result);
    }

    @Test
    void binarySearch2() {
        int[] input = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        System.out.println(Arrays.toString(input));
        int target = 0;
        int expect = 0;
        int result = binarySearch.binarySearch(input, target);
        System.out.println(result);
        assertEquals(expect, result);
    }

    @Test
    void binarySearch3() {
        int[] input = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        System.out.println(Arrays.toString(input));
        int target = 45;
        int expect = 4;
        int result = binarySearch.binarySearch(input, target);
        System.out.println(result);
        assertEquals(expect, result);
    }

    @Test
    void binarySearch5() {
        int[] input = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        System.out.println(Arrays.toString(input));
        int target = 90;
        int expect = -1;
        int result = binarySearch.binarySearch(input, target);
        System.out.println(result);
        assertEquals(expect, result);
    }
}
