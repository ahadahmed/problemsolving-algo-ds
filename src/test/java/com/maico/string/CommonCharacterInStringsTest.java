package com.maico.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonCharacterInStringsTest {
    private CommonCharacterInStrings commonCharacterInStrings;

    @BeforeEach
    void setUp() {
        commonCharacterInStrings = new CommonCharacterInStrings();
    }

    @Test
    void commonCharacters() {
        String[] input = {"abcc"};
        String[] expected = {"a", "b", "c"};
        String[] actual = commonCharacterInStrings.commonCharacters(input);
        assertArrayEquals(expected, actual);
    }
}