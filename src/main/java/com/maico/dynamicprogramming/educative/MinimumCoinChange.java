package com.maico.dynamicprogramming.educative;

import java.util.Arrays;

/**
 * @author ahadahmed - 29/6/20
 * @see <a href="https://www.educative.io/courses/grokking-dynamic-programming-patterns-for-coding-interviews/NE0yNJ1rZy6"> see this</a>
 */
public class MinimumCoinChange {


    /**
     * @param coinValues  array of each coin's value.
     * @param targetTotal Amount to be formed up.
     * @return integer-minimum number of coin required to make up @targetTotal
     */
    public int minimumCoinDp(int[] coinValues, int targetTotal) {
        int minimumNumberOfCoinsRequired = 0;

        int[][] dpTable = new int[coinValues.length][targetTotal + 1];

        // Fill base case, where targetAmount=0;

        for (int i = 0; i < coinValues.length; i++) {
            dpTable[i][0] = 0;
        }

        for (
                int[] i : dpTable) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("-----------------------");

        for (int row = 0; row < coinValues.length; row++) {
            for (int columnSum = 1; columnSum <= targetTotal; columnSum++) {
                int valueExcludingItem;
                int valueIncludingItem;
                dpTable[row][columnSum] = Integer.MAX_VALUE;

                if(row > 0){
                    dpTable[row][columnSum] = dpTable[row - 1][columnSum];
                }
                if (coinValues[row] <= columnSum) {
                    if(dpTable[row][columnSum - coinValues[row]] != Integer.MAX_VALUE)
                        dpTable[row][columnSum] = Math.min(dpTable[row][columnSum],dpTable[row][columnSum - coinValues[row]] + 1);
                }

            }

        }

        for (int[] i : dpTable) {
            System.out.println(Arrays.toString(i));
        }

        minimumNumberOfCoinsRequired = dpTable[coinValues.length - 1][targetTotal] == Integer.MAX_VALUE ? -1 : dpTable[coinValues.length - 1][targetTotal];
        return minimumNumberOfCoinsRequired;

    }
}
