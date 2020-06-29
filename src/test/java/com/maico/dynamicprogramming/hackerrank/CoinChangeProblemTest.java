package com.maico.dynamicprogramming.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeProblemTest {

    @Test
    void prepareDpTable1() {
        CoinChangeProblem coinChangeProblem = new CoinChangeProblem();

        int numberOfCoins = 3;
        int[] coinValues = {1, 2, 3};

        int unitNumber = 4;
        System.out.println("Coin Denominations: "+ Arrays.toString(coinValues));
        System.out.println("Target Number: " + unitNumber);
        System.out.println("Number of ways --> "+coinChangeProblem.prepareDpTable(unitNumber, numberOfCoins, coinValues));
    }

    @Test
    void prepareDpTable2() {
        CoinChangeProblem coinChangeProblem = new CoinChangeProblem();

        int numberOfCoins = 4;
        int[] coinValues = {1, 1, 2, 3};

        int unitNumber = 4;
        System.out.println("Coin Denominations: "+ Arrays.toString(coinValues));
        System.out.println("Target Number: " + unitNumber);
        System.out.println("Number of ways --> "+coinChangeProblem.prepareDpTable(unitNumber, numberOfCoins, coinValues));
    }

    @Test
    void hackerRankTestCase2() {
        CoinChangeProblem coinChangeProblem = new CoinChangeProblem();

        int numberOfCoins = 4;
        int[] coinValues = {2, 5, 3, 6};

        int unitNumber = 10;
        System.out.println("Coin Denominations: "+ Arrays.toString(coinValues));
        System.out.println("Target Number: " + unitNumber);
        System.out.println("Number of ways --> "+coinChangeProblem.prepareDpTable(unitNumber, numberOfCoins, coinValues));
    }
}