package com.maico.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinRewardsTest {

    private MinRewards minRewards;

    public MinRewardsTest(){
        this.minRewards = new MinRewards();
    }

    @Test
    void minRewards() {
        int[] scores =  {8,4,2,1,3,6,7,9,5};

        int actual = this.minRewards.minRewards(scores);
        assertEquals(25, actual);
    }

    @Test
    void minRewards2() {
        int[] scores =  {0,0,0,0,0,0,0,0,0};
        int actual = this.minRewards.minRewards(scores);
        assertEquals(9, actual);
    }

    @Test
    void minRewards3() {
        int[] scores =  {1,2,3,4,5,6,7,8,9};
        int actual = this.minRewards.minRewards(scores);
        assertEquals(45, actual);
    }

    @Test
    void minRewards4() {
        int[] scores =  {9,8,7,4,5,6,7,8,9};

        int actual = this.minRewards.minRewards(scores);
        assertEquals(30, actual);
    }
}
