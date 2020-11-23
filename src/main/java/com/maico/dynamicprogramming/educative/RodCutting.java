package com.maico.dynamicprogramming.educative;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahadahmed - 29/6/20
 * @see <a href="https://www.educative.io/courses/grokking-dynamic-programming-patterns-for-coding-interviews/RM5E56PGnVY"> see this</a>
 */
public class RodCutting {

    public static void main(String[] args) {
        int[] lengths = {1,2,3,4,5};
        int[] prices = {2,6,7,10,13};
        int rodLength = 5;
        int[][] profitTable = rodCuttingBottomUp(lengths, prices, rodLength);
        List<Integer> lengthIndexes = piecesIncluded(profitTable, lengths, prices,rodLength);
        for(int i: lengthIndexes){
            System.out.println("length: " + lengths[i] +" price:"+prices[i]);
        }
        System.out.println("maxprofit :" + profitTable[lengths.length - 1][rodLength]);
        System.out.println(piecesIncluded(profitTable, lengths, prices,rodLength));

    }


    public static int[][] rodCuttingBottomUp(int[] lengths, int[] prices, int rodLength) {
        int maxProfit = 0;

        int[][] maxProfitMemoizeTable = new int[lengths.length][rodLength + 1];

        for (int i = 0; i < lengths.length; i++) {
            maxProfitMemoizeTable[i][0] = 0;
        }

        for (int i = 0; i < lengths.length; i++) {
            for (int length = 1; length <= rodLength; length++) {
                int profitIncludingThisLength = 0;
                int profitExcludingThisLength = 0;

                if (lengths[i] <= length) {
                    profitIncludingThisLength = prices[i] + maxProfitMemoizeTable[i][length - lengths[i]];

                }
                if (i > 0) {
                    profitExcludingThisLength = maxProfitMemoizeTable[i - 1][length];
                }
                maxProfitMemoizeTable[i][length] = Math.max(profitIncludingThisLength, profitExcludingThisLength);
            }


        }
        return maxProfitMemoizeTable;
    }



    public static List<Integer> piecesIncluded(int[][] memoizeTable,int[] lengths,int[] prices, int rodLength){
        List<Integer> piecesIndex = new ArrayList<>();
        int totalProfit = memoizeTable[lengths.length - 1][rodLength];
        for(int i=lengths.length - 1; i > 0; i--){

            if(totalProfit != memoizeTable[i -1][rodLength]){
                piecesIndex.add(i);
                rodLength -= lengths[i];
                totalProfit -=prices[i];

            }

        }

        if(rodLength != 0){
            piecesIndex.add(0);
        }

        return piecesIndex;
    }
}
