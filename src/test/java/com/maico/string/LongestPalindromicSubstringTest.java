package com.maico.string;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubstringTest {

    private static LongestPalindromicSubstring longestPalindromicSubstring;

    @BeforeAll
    static void init() {
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    void longestPalindromicSubstring() {
        String input = "abaxyzzyxf";
        System.out.println("input: " + Arrays.toString(input.toCharArray()));
        String expected = "xyzzyx";
        System.out.println("expect: " + Arrays.toString(expected.toCharArray()));
        String output = longestPalindromicSubstring.longestPalindromicSubstring(input);
        System.out.println("output: " + Arrays.toString(output.toCharArray()));
        assertEquals(expected, output);
    }

    @Test
    void longestPalindromicSubstring2() {
        String input = "aba";
        System.out.println("input: " + Arrays.toString(input.toCharArray()));
        String expected = "aba";
        System.out.println("expect: " + Arrays.toString(expected.toCharArray()));
        String output = longestPalindromicSubstring.longestPalindromicSubstring(input);
        System.out.println("output: " + Arrays.toString(output.toCharArray()));
        assertEquals(expected, output);
    }

    @Test
    void longestPalindromicSubstring3() {
        String input = "ab";
        System.out.println("input: " + Arrays.toString(input.toCharArray()));
        String expected = "b";
        System.out.println("expect: " + Arrays.toString(expected.toCharArray()));
        String output = longestPalindromicSubstring.longestPalindromicSubstring(input);
        System.out.println("output: " + Arrays.toString(output.toCharArray()));
        assertEquals(expected, output);
    }



}
