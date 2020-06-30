package com.maico.dynamicprogramming.educative;


import java.util.Arrays;

/**
 * @author ahadahmed - 30/6/20
 * @see <a href="https://www.educative.io/courses/grokking-dynamic-programming-patterns-for-coding-interviews/B8Pq4ZnBN0N"> see this</a>
 */
public class LongestCommonSubsequence {

    public int getLCSLength(String s1, String s2){
        int LCSlength = 0;

        int[][] dpTable = new int[s1.length()+1][s2.length()+1];


        for (int row = 1; row <= s1.length(); row++) {
            for (int column = 1; column <= s2.length(); column++) {
                if(s1.charAt(row - 1) == s2.charAt(column - 1)){
                    dpTable[row][column] = dpTable[row - 1][column - 1] + 1;
                }else {
                    dpTable[row][column] = Math.max(dpTable[row - 1][column], dpTable[row][column - 1]);
                }
            }
        }

        for (int[] a : dpTable) {
            System.out.println(Arrays.toString(a));
        }

        LCSlength = dpTable[s1.length()][s2.length()];

        return LCSlength;
    }
}
