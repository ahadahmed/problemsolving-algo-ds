package com.maico.dynamicprogramming.educative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSubsetSumPartitionTest {

    @Test
    void prepareDpTable1() {
        EqualSubsetSumPartition equalSubsetSumPartition = new EqualSubsetSumPartition();
        int[] inputArray = {1,2,3,4};
        System.out.println("Output: "+equalSubsetSumPartition.prepareDpTable(inputArray));
    }

    @Test
    void prepareDpTable2() {
        EqualSubsetSumPartition equalSubsetSumPartition = new EqualSubsetSumPartition();
        int[] inputArray = {5,2,3,4};
        System.out.println("Output: "+equalSubsetSumPartition.prepareDpTable(inputArray));
    }

    @Test
    void prepareDpTable3() {
        EqualSubsetSumPartition equalSubsetSumPartition = new EqualSubsetSumPartition();
        int[] inputArray = {5,2,5,4};
        System.out.println("Output: "+equalSubsetSumPartition.prepareDpTable(inputArray));
    }
}