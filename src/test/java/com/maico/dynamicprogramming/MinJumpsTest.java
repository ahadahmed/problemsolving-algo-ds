package com.maico.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinJumpsTest {
    private MinJumps minJumps;

    MinJumpsTest(){
        this.minJumps = new MinJumps();
    }

    @Test
    void minNumberOfJumps() {
        int[] input = {3,4,2,1,2,3,7,1,1,3};
        int output = this.minJumps.minNumberOfJumps(input);
        assertEquals(4, output);
    }

    @Test
    void minNumberOfJumps2() {
        int[] input = {3,4,2,1,7,3,7,1,1,3};
        int output = this.minJumps.minNumberOfJumps(input);
        assertEquals(3, output);
    }

    @Test
    void minNumberOfJumps3() {
        int[] input = {3,4,9,1,7,3,7,1,1,3};
        int output = this.minJumps.minNumberOfJumps(input);
        assertEquals(2, output);
    }

    @Test
    void minNumberOfJumps4() {
        int[] input = {3};
        int output = this.minJumps.minNumberOfJumps(input);
        assertEquals(0, output);
    }

    @Test
    void minNumberOfJumps5() {
        int[] input = {1};
        int output = this.minJumps.minNumberOfJumps(input);
        assertEquals(0, output);
    }

    @Test
    void minNumberOfJumps6() {
        int[] input = {1, 1};
        int output = this.minJumps.minNumberOfJumps(input);
        assertEquals(1, output);
    }
}
