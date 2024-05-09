package com.maico.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationTest {

    private ReversePolishNotation reversePolishNotation;

    @BeforeEach
    void init(){
        reversePolishNotation = new ReversePolishNotation();
    }

    @Test
    void evaluateReversePolishNotation() {
        String[] tokens = {"50", "3", "17", "+", "2", "-", "/"};
        int actualReuslt = reversePolishNotation.evaluateReversePolishNotation(tokens);
        Integer expectedResult  = 2;
        assertEquals(expectedResult, actualReuslt, "Result must be 2");
    }

    @Test
    void evaluateReversePolishNotation2() {
        String[] tokens = {"10"};
        int actualReuslt = reversePolishNotation.evaluateReversePolishNotation(tokens);
        Integer expectedResult  = 10;
        assertEquals(expectedResult, actualReuslt, "Result must be 10");
    }

    @Test
    void evaluateReversePolishNotation3() {
        String[] tokens = {"4", "-7", "2", "6", "+", "10", "-", "/", "*", "2", "+", "3", "*", "0", "*"};
        int actualReuslt = reversePolishNotation.evaluateReversePolishNotation(tokens);
        Integer expectedResult  = 0;
        assertEquals(expectedResult, actualReuslt, "Result must be 10");
    }
}