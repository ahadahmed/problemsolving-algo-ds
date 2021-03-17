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
}
