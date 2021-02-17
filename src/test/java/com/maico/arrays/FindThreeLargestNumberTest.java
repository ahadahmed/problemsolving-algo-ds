package com.maico.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindThreeLargestNumberTest {

    private static FindThreeLargestNumber threeLargestNumber;

    @BeforeAll
    static void init(){
        threeLargestNumber = new FindThreeLargestNumber();
    }

    @Test
    void findThreeLargestNUmber() {
        int[] input = {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        System.out.println("input: "+Arrays.toString(input));
        int[] expect = {18, 141, 541};
        System.out.println("expect: "+ Arrays.toString(expect));
        int[] result = threeLargestNumber.findThreeLargestNUmber(input);
        System.out.println("result: "+Arrays.toString(result));
        assertArrayEquals(expect, result);
    }

    @Test
    void findThreeLargestNUmber2() {
        int[] input = {10, 5, 9, 10 ,12};
        System.out.println("input: "+Arrays.toString(input));
        int[] expect = {10, 10 , 12};
        System.out.println("expect: "+ Arrays.toString(expect));
        int[] result = threeLargestNumber.findThreeLargestNUmber(input);
        System.out.println("result: "+Arrays.toString(result));
        assertArrayEquals(expect, result);
    }
}
