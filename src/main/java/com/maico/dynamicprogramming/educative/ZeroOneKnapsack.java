package com.maico.dynamicprogramming.educative;

import java.util.Arrays;

/**
 * @author ahadahmed - 28/6/20
 * @see <a href="https://www.educative.io/courses/grokking-dynamic-programming-patterns-for-coding-interviews/RM1BDv71V60">
 * see this</a>
 */
public class ZeroOneKnapsack {


    public int[][] formulateDpTable(int[] profit, int[] weight, int knapsackCapacity) {
//        initiaze table for dp tabulation process;
//        int dpTable[][] = new int[profit.length][knapsackCapacity + 1];
        int dpTable[][] = new int[profit.length][knapsackCapacity + 1];
//        if kanpsackCapacity = 0 then we can't choose any item, which is base case.
//        so for column '0' all the values will be '0'
//        here the column index  will represent the knapsackCapacity for sub problems;

        for (int row = 0; row < profit.length - 1; row++) {
            dpTable[row][0] = 0;
        }

//       if we have to choose only one item then, we will choose the item if it's weight <= knapsackCapacity. Which is another base case

        for (int capacity = 1; capacity <= knapsackCapacity; capacity++) {
            if (weight[0] <= capacity) {
                dpTable[0][capacity] = profit[0];

            }
        }

        for (int[] innerArray : dpTable) {
            System.out.println(Arrays.toString(innerArray));
        }

        System.out.println("--------------");

//        Fill other cells.
//        here the row index(value of variable 'row') will represent the item;
        for (int row = 1; row <= profit.length - 1; row++) {
            for (int capacity = 1; capacity <= knapsackCapacity; capacity++) {
                int profitIncludingCurrentItem = 0, profitExcludingCurrentItem = 0;
//                include current item
                if (weight[row] <= capacity) {
                    profitIncludingCurrentItem = profit[row] + dpTable[row - 1][capacity - weight[row]];
                }
//                exclude current item
                profitExcludingCurrentItem = dpTable[row - 1][capacity];
                dpTable[row][capacity] = Math.max(profitIncludingCurrentItem, profitExcludingCurrentItem);

            }
        }

        // print dpTable
        for (int[] innerArray : dpTable) {
            System.out.println(Arrays.toString(innerArray));
        }

        return dpTable;
    }

    void printChosenItems(int[][] dpTable, int[] profit, int[] weight, int knapsackCapacity) {
        int currentCapacity = knapsackCapacity;
        int currentMaxProfit = dpTable[profit.length - 1][currentCapacity];
        for (int i = profit.length - 1; i > 0; i--) {
            // this condition ensures current max profit is calculated using this current item
            if (currentMaxProfit != dpTable[i - 1][currentCapacity]) {
                System.out.println("item[" + i + "]: " + "weight->" + weight[i]);
                currentMaxProfit -= profit[i];
                currentCapacity -= weight[i];
            }
        }
        if (currentMaxProfit != 0) {
            System.out.println("item[" + 0 + "]: " + "weight->" + weight[0]);
        }
    }

    public static void main(String[] args) {
        int[] profit = {1, 6, 10, 16};
        int[] weight = {1, 2, 3, 5};
        int knapsackCapacity = 7;
        ZeroOneKnapsack zeroOneKnapsack = new ZeroOneKnapsack();
        int[][] dpTable = zeroOneKnapsack.formulateDpTable(profit, weight, knapsackCapacity);
        zeroOneKnapsack.printChosenItems(dpTable, profit, weight, knapsackCapacity);
    }

}
