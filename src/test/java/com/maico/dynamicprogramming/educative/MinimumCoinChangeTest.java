package com.maico.dynamicprogramming.educative;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MinimumCoinChangeTest {


    private MinimumCoinChange minimumCoinChange = new MinimumCoinChange();

    @Test
    void minimumCoinDp5() {


        int[] coins = {1, 2, 3};
        int targetAmount = 5;
        System.out.println("coins: " + Arrays.toString(coins));
        System.out.println("target sum: " + targetAmount);
        int minRequiredCoin = minimumCoinChange.minimumCoinDp(coins, targetAmount);
        System.out.println("Minimum coin required: " + minRequiredCoin);
    }


    @Test
    void minimumCoinDp7() {


        int[] coins = {1, 2, 3};
        int targetAmount = 7;
        System.out.println("coins: " + Arrays.toString(coins));
        System.out.println("target sum: " + targetAmount);
        int minRequiredCoin = minimumCoinChange.minimumCoinDp(coins, targetAmount);
        System.out.println("Minimum coin required: " + minRequiredCoin);
    }

    @Test
    void minimumCoinDp11() {


        int[] coins = {1, 2, 3};
        int targetAmount = 11;
        System.out.println("coins: " + Arrays.toString(coins));
        System.out.println("target sum: " + targetAmount);
        int minRequiredCoin = minimumCoinChange.minimumCoinDp(coins, targetAmount);
        System.out.println("Minimum coin required: " + minRequiredCoin);
    }

    @Test
    void minimumCoinDpFailed7() {


        int[] coins = {3, 5};
        int targetAmount = 7;
        System.out.println("coins: " + Arrays.toString(coins));
        System.out.println("target sum: " + targetAmount);
        int minRequiredCoin = minimumCoinChange.minimumCoinDp(coins, targetAmount);
        System.out.println("Minimum coin required: " + minRequiredCoin);
    }
}