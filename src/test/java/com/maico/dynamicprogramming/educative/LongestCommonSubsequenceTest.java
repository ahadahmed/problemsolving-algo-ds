package com.maico.dynamicprogramming.educative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {

    @Test
    void getLCSLength() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "abdca";
        String s2 = "cbda";
        System.out.println(lcs.getLCSLength(s2, s1));
    }


    @Test
    void getLCSLength2() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "passport";
        String s2 = "ppsspt";
        System.out.println(lcs.getLCSLength(s2, s1));
    }

    @Test
    void getLCSLength3() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "avc";
        String s2 = "def";
        System.out.println(lcs.getLCSLength(s2, s1));
    }
}