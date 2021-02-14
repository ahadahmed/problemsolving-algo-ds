package com.maico.string;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SmallestSubStringContainingPatternTest {

    private static SmallestSubStringContainingPattern smallestSubStringContainingPattern;

    @BeforeAll
    static void init(){
        smallestSubStringContainingPattern = new SmallestSubStringContainingPattern();
    }

    @Test
    void smallestSubStringContainingPattern() {
        String bigString = "abcd$ef$axb$c$";
        System.out.println("input:" + Arrays.toString(bigString.toCharArray()));
        String pattern = "$$abf";
        System.out.println("patern:" + Arrays.toString(pattern.toCharArray()));
        String expected = "f$axb$";
        System.out.println("expected:" + Arrays.toString(expected.toCharArray()));
        String result = smallestSubStringContainingPattern.smallestSubStringContainingPattern(bigString, pattern);
        System.out.println("output:" + Arrays.toString(result.toCharArray()));
        System.out.println(result);
        assertEquals(expected, result);
    }

    @Test
    void smallestSubStringContainingPattern2() {
        String bigString = "abc";
        System.out.println("input:" + Arrays.toString(bigString.toCharArray()));
        String pattern = "a";
        System.out.println("patern:" + Arrays.toString(pattern.toCharArray()));
        String expected = "a";
        System.out.println("expected:" + Arrays.toString(expected.toCharArray()));
        String result = smallestSubStringContainingPattern.smallestSubStringContainingPattern(bigString, pattern);
        System.out.println("output:" + Arrays.toString(result.toCharArray()));
        System.out.println(result);
        assertEquals(expected, result);
    }

    @Test
    void smallestSubStringContainingPattern3() {
        String bigString = "abc";
        System.out.println("input:" + Arrays.toString(bigString.toCharArray()));
        String pattern = "d";
        System.out.println("patern:" + Arrays.toString(pattern.toCharArray()));
        String expected = "";
        System.out.println("expected:" + Arrays.toString(expected.toCharArray()));
        String result = smallestSubStringContainingPattern.smallestSubStringContainingPattern(bigString, pattern);
        System.out.println("output:" + Arrays.toString(result.toCharArray()));
        System.out.println(result);
        assertEquals(expected, result);
    }

    @Test
    void smallestSubStringContainingPattern4() {
        String bigString = "abc";
        System.out.println("input:" + Arrays.toString(bigString.toCharArray()));
        String pattern = "aa";
        System.out.println("patern:" + Arrays.toString(pattern.toCharArray()));
        String expected = "";
        System.out.println("expected:" + Arrays.toString(expected.toCharArray()));
        String result = smallestSubStringContainingPattern.smallestSubStringContainingPattern(bigString, pattern);
        System.out.println("output:" + Arrays.toString(result.toCharArray()));
        System.out.println(result);
        assertEquals(expected, result);
    }
}
