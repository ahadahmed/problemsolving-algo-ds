package com.maico.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaesarCipherTest {

    @Test
    void caesorCipherEncryptor() {
        CaesarCipher caesarCipher = new CaesarCipher();
        String input = "xyz";
        String expected = "zab";
        assertEquals(expected, caesarCipher.caesarCipherEncryptor(input, 2));
    }

    @Test
    void caesorCipherEncryptor2() {
        CaesarCipher caesarCipher = new CaesarCipher();
        String input = "abc";
        String expected = "abc";
        assertEquals(expected, caesarCipher.caesarCipherEncryptor(input, 52));
    }
}