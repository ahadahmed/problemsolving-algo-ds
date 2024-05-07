package com.maico.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreOfaStringTest {

    private ScoreOfaString scoreOfaString;

    @BeforeEach
    void setUp() {
        scoreOfaString = new ScoreOfaString();
    }


    @Test
    void test1() {
        String inputStriing = "hello";
        int expectedScore = 13;
        assertEquals(expectedScore, scoreOfaString.scoreOfString(inputStriing));
    }

    @Test
    void test2() {
        String inputStriing = "zaz";
        int expectedScore = 50;
        assertEquals(expectedScore, scoreOfaString.scoreOfString(inputStriing));
    }

    @Test
    void test3() {
        String inputStriing = "a";
        int expectedScore = 97;
        assertEquals(expectedScore, scoreOfaString.scoreOfString(inputStriing));
    }


}