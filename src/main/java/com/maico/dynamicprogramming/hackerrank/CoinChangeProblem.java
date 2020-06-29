package com.maico.dynamicprogramming.hackerrank;

import java.util.Arrays;

/**
 * @author ahadahmed - 28/6/20
 * @see <a href="https://www.hackerrank.com/challenges/coin-change/problem"> see this</a>
 */
public class CoinChangeProblem {


    int prepareDpTable(int unitNumber, int numberOfCoins, int[] coinValues) {

        int[][] dpTable = new int[numberOfCoins][unitNumber + 1];

        for (int coin = 0; coin < numberOfCoins; coin++) {
            dpTable[coin][0] = 1;
        }


        for (int row = 0; row < coinValues.length; row++) {
            for (int columnUnitSum = 1; columnUnitSum <= unitNumber; columnUnitSum++) {

                if (row > 0) {
                    dpTable[row][columnUnitSum] = dpTable[row - 1][columnUnitSum];
                }

                if (columnUnitSum >= coinValues[row]) {
                    dpTable[row][columnUnitSum] += dpTable[row][columnUnitSum - coinValues[row]];
                }
            }
        }

        for (int[] i : dpTable) {
            System.out.println(Arrays.toString(i));
        }

        return dpTable[numberOfCoins - 1][unitNumber];


    }


}
