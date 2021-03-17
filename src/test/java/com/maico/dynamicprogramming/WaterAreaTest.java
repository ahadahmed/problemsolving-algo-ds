package com.maico.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterAreaTest {

    private WaterArea waterArea;

    WaterAreaTest(){
        this.waterArea = new WaterArea();
    }

    @Test
    void waterArea() {
        int[] input = {0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3};
        int output = this.waterArea.waterArea(input);
        assertEquals(48, output);
    }

    @Test
    void waterArea1() {
        int[] input = {};
        int output = this.waterArea.waterArea(input);
        assertEquals(0, output);
    }

    @Test
    void waterArea2() {
        int[] input = {0,0,0, 0};
        int output = this.waterArea.waterArea(input);
        assertEquals(0, output);
    }

    @Test
    void waterArea3() {
        int[] input = {1,1,1, 1};
        int output = this.waterArea.waterArea(input);
        assertEquals(0, output);
    }

    @Test
    void waterArea4() {
        int[] input = {0,1,0, 0};
        int output = this.waterArea.waterArea(input);
        assertEquals(0, output);
    }

    @Test
    void waterArea5() {
        int[] input = {0,1,1, 0};
        int output = this.waterArea.waterArea(input);
        assertEquals(0, output);
    }

    @Test
    void waterArea6() {
        int[] input = {0,1,2, 1,1};
        int output = this.waterArea.waterArea(input);
        assertEquals(0, output);
    }

    @Test
    void waterArea7() {
        int[] input = {0,1,0, 1,1};
        int output = this.waterArea.waterArea(input);
        assertEquals(1, output);
    }

    @Test
    void waterArea8() {
        int[] input = {0, 1, 0, 1, 0, 2, 0, 3};

        int output = this.waterArea.waterArea(input);
        assertEquals(4, output);
    }
}
