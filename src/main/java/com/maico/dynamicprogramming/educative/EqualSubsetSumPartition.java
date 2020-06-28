package com.maico.dynamicprogramming.educative;

import java.util.Arrays;

/**
 * @author ahadahmed - 28/6/20
 * @see <a href="https://www.educative.io/courses/grokking-dynamic-programming-patterns-for-coding-interviews/3jEPRo5PDvx"> see this</a>
 */
public class EqualSubsetSumPartition {

//    int[] inputArray = {1,2,3,4};


    boolean prepareDpTable(int[] inputArray){

        boolean output = false;

        int totalSum = 0;

        for(int i=0; i<inputArray.length; i++){
            totalSum+=inputArray[i];
        }

        if(totalSum % 2 != 0){
            System.out.println("Output: " + output);
        }

        int subsetSum = totalSum / 2;

        boolean[][] dpTable = new boolean[inputArray.length][subsetSum + 1];

        for(int i = 0; i < inputArray.length; i++){
            dpTable[i][0] = true;
        }

        for(int columnSum = 1; columnSum <= subsetSum; columnSum ++){
            if(columnSum == inputArray[0]){
                dpTable[0][columnSum] = true;
            }else {
                dpTable[0][columnSum] = false;
            }
        }

       /* for(boolean[] b : dpTable){
            System.out.println(Arrays.toString(b));
        }*/

        for(int row = 1; row < inputArray.length; row++){
            for (int columnSum = 1; columnSum <= subsetSum; columnSum++){
                boolean excludingCurrentItem = false, includingCurrentItem = false;
                // include current item
                if(columnSum >= inputArray[row]){
                    includingCurrentItem = dpTable[row - 1][columnSum - inputArray[row]];
                }

                excludingCurrentItem = dpTable[row - 1][columnSum];

                dpTable[row][columnSum] = includingCurrentItem || excludingCurrentItem;

            }
        }

        for(boolean[] b : dpTable){
            System.out.println(Arrays.toString(b));
        }



        return dpTable[inputArray.length - 1][subsetSum];

    }
}
