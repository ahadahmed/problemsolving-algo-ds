package com.maico.stack;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MinMaxStackTest {
    private static MinMaxStack minMaxStack;

    @BeforeAll
    static void init(){
        minMaxStack = new MinMaxStack();
    }

    @Test
    @Order(1)
    void push3_2() {
        minMaxStack.push(3);
        minMaxStack.push(2);
    }

    @Test
    @Order(2)
    void minMaxTest2_3(){
        assertEquals(2, minMaxStack.getMin());
        assertEquals(3, minMaxStack.getMax());
    }

    @Test
    @Order(2)
    void peek2() {
        assertEquals(2, minMaxStack.peek());
    }

    @Test
    @Order(2)
    void printStack2() {
        minMaxStack.printStack();
    }

    @Test
    @Order(3)
    void pop2() {
        Integer value = minMaxStack.pop();
        assertEquals(2, value);
    }

    @Test
    @Order(4)
    void minMaxTest3_3(){
        assertEquals(3, minMaxStack.getMin());
        assertEquals(3, minMaxStack.getMax());
    }

    @Test
    @Order(4)
    void printStack3() {
        minMaxStack.printStack();
    }


    @Test
    @Order(5)
    void push7_8() {
        minMaxStack.push(7);
        minMaxStack.push(8);
    }

    @Test
    @Order(6)
    void minMaxTest3_8(){
        assertEquals(3, minMaxStack.getMin());
        assertEquals(8, minMaxStack.getMax());
    }


    @Test
    @Order(6)
    void peek8() {
        assertEquals(8, minMaxStack.peek());
    }

    @Test
    @Order(6)
    void printStack8() {
        minMaxStack.printStack();
    }

    @Test
    @Order(7)
    void pop8(){
        Integer value = minMaxStack.pop();
        assertEquals(8, value);
    }

    @Test
    @Order(8)
    void minMaxTest3_7(){
        assertEquals(3, minMaxStack.getMin());
        assertEquals(7, minMaxStack.getMax());
    }

    @Test
    @Order(8)
    void peek7() {
        assertEquals(7, minMaxStack.peek());
    }



    @Test
    @Order(8)
    void printStack() {
        minMaxStack.printStack();
    }
}
