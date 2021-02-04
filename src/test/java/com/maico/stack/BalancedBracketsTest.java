package com.maico.stack;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    private static BalancedBrackets balancedBrackets;

    @BeforeAll
    static void init(){
        balancedBrackets = new BalancedBrackets();

    }

    @Test
    void isBalanced() {
        String s = "(({}))";
        boolean result = balancedBrackets.isBalanced(s);
        System.out.println(result);
        assertTrue(result);
    }


    @Test
    void isBalanced2() {
        String s = "((";
        boolean result = balancedBrackets.isBalanced(s);
        System.out.println(result);
        assertFalse(result);
    }

    @Test
    void isBalanced3() {
        String s = "()";
        boolean result = balancedBrackets.isBalanced(s);
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    void isBalanced4() {
        String s = "";
        boolean result = balancedBrackets.isBalanced(s);
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    void isBalanced5() {
        String s = "(){}{}{}{}{}{{{{}}}}))))))";
        boolean result = balancedBrackets.isBalanced(s);
        System.out.println(result);
        assertFalse(result);
    }

    @Test
    void isBalanced6() {
        String s = "}}}))))))";
        boolean result = balancedBrackets.isBalanced(s);
        System.out.println(result);
        assertFalse(result);
    }

    @Test
    void isBalanced7() {
        String s = "";
        boolean result = balancedBrackets.isBalanced(s);
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    void isBalanced7_1() {
        String s = "(a)";
        boolean result = balancedBrackets.isBalanced(s);
        System.out.println(result);
        assertTrue(result);
    }





}
