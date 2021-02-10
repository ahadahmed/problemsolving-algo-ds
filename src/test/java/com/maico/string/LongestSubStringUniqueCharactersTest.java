package com.maico.string;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubStringUniqueCharactersTest {

    private static LongestSubStringUniqueCharacters longestSubString;

    @BeforeAll
    static void init() {
        longestSubString = new LongestSubStringUniqueCharacters();
    }

    @Test
    void longestSubstringWithoutDuplication() {
        String input = "clementisacap";
        System.out.println("input: " + Arrays.toString(input.toCharArray()));
        String expected = "mentisac";
        System.out.println("expect: " + Arrays.toString(expected.toCharArray()));

        String output = longestSubString.longestSubstringWithoutDuplication(input);
        System.out.println("output: " + Arrays.toString(output.toCharArray()));
        assertEquals(expected, output);
    }

    @Test
    void longestSubstringWithoutDuplication2() {
        String input = "cleme";
        System.out.println("input: " + Arrays.toString(input.toCharArray()));
        String expected = "clem";
        System.out.println("expect: " + Arrays.toString(expected.toCharArray()));

        String output = longestSubString.longestSubstringWithoutDuplication(input);
        System.out.println("output: " + Arrays.toString(output.toCharArray()));
        assertEquals(expected, output);
    }

    @Test
    void longestSubstringWithoutDuplication3() {
        String input = "c";
        System.out.println("input: " + Arrays.toString(input.toCharArray()));
        String expected = "c";
        System.out.println("expect: " + Arrays.toString(expected.toCharArray()));

        String output = longestSubString.longestSubstringWithoutDuplication(input);
        System.out.println("output: " + Arrays.toString(output.toCharArray()));
        assertEquals(expected, output);
    }

    @Test
    void longestSubstringWithoutDuplication4() {
        String input = "";
        System.out.println("input: " + Arrays.toString(input.toCharArray()));
        String expected = "";
        System.out.println("expect: " + Arrays.toString(expected.toCharArray()));

        String output = longestSubString.longestSubstringWithoutDuplication(input);
        System.out.println("output: " + Arrays.toString(output.toCharArray()));
        assertEquals(expected, output);
    }

    @Test
    void longestSubstringWithoutDuplication5() {
        String input = "abcdeabcdefc";
        System.out.println("input: " + Arrays.toString(input.toCharArray()));
        String expected = "abcdef";
        System.out.println("expect: " + Arrays.toString(expected.toCharArray()));

        String output = longestSubString.longestSubstringWithoutDuplication(input);
        System.out.println("output: " + Arrays.toString(output.toCharArray()));
        assertEquals(expected, output);
    }


}
