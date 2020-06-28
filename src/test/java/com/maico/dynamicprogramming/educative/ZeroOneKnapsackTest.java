package com.maico.dynamicprogramming.educative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroOneKnapsackTest {


    @Test
    void formulateDpTableCapacity7() {
        int[] profit = {1, 6, 10, 16};
        int[] weight = {1, 2, 3, 5};
        int knapsackCapacity = 7;
        ZeroOneKnapsack zeroOneKnapsack = new ZeroOneKnapsack();
        int[][] dpTable = zeroOneKnapsack.formulateDpTable(profit, weight, knapsackCapacity);
        zeroOneKnapsack.printChosenItems(dpTable, profit, weight, knapsackCapacity);
    }

    @Test
    void formulateDpTableCapacity6() {
        int[] profit = {1, 6, 10, 16};
        int[] weight = {1, 2, 3, 5};
        int knapsackCapacity = 6;
        ZeroOneKnapsack zeroOneKnapsack = new ZeroOneKnapsack();
        int[][] dpTable = zeroOneKnapsack.formulateDpTable(profit, weight, knapsackCapacity);
        zeroOneKnapsack.printChosenItems(dpTable, profit, weight, knapsackCapacity);
    }
}