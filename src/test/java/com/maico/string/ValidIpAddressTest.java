package com.maico.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ValidIpAddressTest {

    private ValidIpAddress validIpAddress;

    @BeforeEach
    void setUp() {
        validIpAddress = new ValidIpAddress();
    }

    @Test
    void validIPAddresses() {
        String input =  "1921";
        ArrayList<String> actual = validIpAddress.validIPAddresses(input);
        assertEquals(1, actual.size());


    }

    @Test
    void validIPAddresses2() {
        String input =  "192";
        ArrayList<String> actual = validIpAddress.validIPAddresses(input);
        assertEquals(0, actual.size());


    }

    @Test
    void validIPAddresses3() {
        String input =  "1921680";
        ArrayList<String> actual = validIpAddress.validIPAddresses(input);
        assertEquals(11, actual.size());


    }

    @Test
    void validIPAddresses4() {
        String input =  "";
        ArrayList<String> actual = validIpAddress.validIPAddresses(input);
        assertEquals(0, actual.size());


    }

    @Test
    void test(){
        Map<String, Boolean> numberRange = new HashMap();

            for(int i = 0; i < 256; i++){
                numberRange.put(String.valueOf(i) , true);
            }

        System.out.println(numberRange.get("1000"));

    }
}