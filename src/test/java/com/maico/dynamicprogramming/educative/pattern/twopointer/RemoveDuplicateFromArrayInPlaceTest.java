package com.maico.dynamicprogramming.educative.pattern.twopointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RemoveDuplicateFromArrayInPlaceTest {

    int[] test1InputArray;
    int[] test1ExpectedResult;

    int[] test2InputArray;
    int[] test2ExpectedResult;

    int[] test3InputArray;
    int[] test3ExpectedResult;

    int[] test4InputArray;
    int[] test4ExpectedResult;

    @BeforeEach
    public void setup() {
        // initialize test1
        test1InputArray = new int[]{2, 3, 3, 6, 9, 9};
        test1ExpectedResult = new int[]{2, 3, 6, 9};

        // initialize test2
        test2InputArray = new int[] {2,2,2,2,2,2};
        test2ExpectedResult = new int[] {2};

        // initialize test3
        test3InputArray  = new int[]{2,2,2,11};
        test3ExpectedResult = new int[]{2,11};

        // initialize test4
        test4InputArray = new int[]{-1,-2, 0, 1,1,5,7};
        test4ExpectedResult = new int[] {-1,-2,0,1,5,7};
    }

    @Test
    void removeDuplicateInPlace_Test1() {
        int length = RemoveDuplicateFromArrayInPlace.removeDuplicateInPlace(test1InputArray);
        System.out.println(length);
        int[] resultArray = Arrays.copyOf(test1InputArray, length);
        assertArrayEquals(test1ExpectedResult, resultArray);
        System.out.println(Arrays.toString(resultArray));
    }

    @Test
    void removeDuplicateInPlace_Test2() {
        int length = RemoveDuplicateFromArrayInPlace.removeDuplicateInPlace(test2InputArray);
        System.out.println(length);
        int[] resultArray = Arrays.copyOf(test2InputArray, length);
        assertArrayEquals(test2ExpectedResult, resultArray);
        System.out.println(Arrays.toString(resultArray));
    }

    @Test
    void removeDuplicateInPlace_Test3() {
        int length = RemoveDuplicateFromArrayInPlace.removeDuplicateInPlace(test3InputArray);
        System.out.println(length);
        int[] resultArray = Arrays.copyOf(test3InputArray, length);
        assertArrayEquals(test3ExpectedResult, resultArray);
        System.out.println(Arrays.toString(resultArray));
    }


    @Test
    void removeDuplicateInPlace_Test4() {
        int length = RemoveDuplicateFromArrayInPlace.removeDuplicateInPlace(test4InputArray);
        System.out.println(length);
        int[] resultArray = Arrays.copyOf(test4InputArray, length);
        assertArrayEquals(test4ExpectedResult, resultArray);
        System.out.println(Arrays.toString(resultArray));
    }
}
