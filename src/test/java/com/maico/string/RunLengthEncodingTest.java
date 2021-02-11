package com.maico.string;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RunLengthEncodingTest {

    private static RunLengthEncoding runLengthEncoding;

    @BeforeAll
    static void init() {
        runLengthEncoding = new RunLengthEncoding();
    }

    @Test
    void runLengthEncoding() {
        String input = "AAAAAAAAAAAAABBCCCCDD";
        String expected = "9A4A2B4C2D";
        System.out.println("input: " + input);
        System.out.println("expect: " + expected);
        String output = runLengthEncoding.runLengthEncoding(input);
        System.out.println("output: " + output);
        assertEquals(expected, output);

    }

    @Test
    void runLengthEncoding1() {
        String input = "ABCD";
        String expected = "1A1B1C1D";
        System.out.println("input: " + input);
        System.out.println("expect: " + expected);
        String output = runLengthEncoding.runLengthEncoding(input);
        System.out.println("output: " + output);
        assertEquals(expected, output);

    }
    @Test
    void runLengthEncoding2() {
        String input = "aA";
        String expected = "1a1A";
        System.out.println("input: " + input);
        System.out.println("expect: " + expected);
        String output = runLengthEncoding.runLengthEncoding(input);
        System.out.println("output: " + output);
        assertEquals(expected, output);

    }

    @Test
    void runLengthEncoding3() {
        String input = "122333";
        String expected = "112233";
        System.out.println("input: " + input);
        System.out.println("expect: " + expected);
        String output = runLengthEncoding.runLengthEncoding(input);
        System.out.println("output: " + output);
        assertEquals(expected, output);

    }

    @Test
    void runLengthEncoding4() {
        String input = "...//++";
        String expected = "3.2/2+";
        System.out.println("input: " + input);
        System.out.println("expect: " + expected);
        String output = runLengthEncoding.runLengthEncoding(input);
        System.out.println("output: " + output);
        assertEquals(expected, output);

    }
}
