package com.maico.recursion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintStringReversedTest {

    private static PrintStringReversed printStringReversed;
    @BeforeAll
   public static void init(){
        printStringReversed = new PrintStringReversed();
    }

    @Test
    void reversedString1() {
        String input = "abc";
        printStringReversed.reversedString(input);
    }

    @Test
    void reversedString2() {
        String input = "cba";
        printStringReversed.reversedString(input);
    }

    @Test
    void reversedString3() {
        String input = "87654321";
        printStringReversed.reversedString(input);
    }
}