package com.maico.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ahadahmed - 14/11/20
 * @see <a href="#"> see this</a>
 */
public class RectableBoxFit {

    //  input =    [[0,2,3], [0,6,3], [1,3,6], [1,2,4]]

//   a =  [[0,2,3], [1,6,3], [0,3,6], [1,2,4]]


    public static void main(String[] args) {
//      int[][]  input =    {{0,2,3}, {0,6,3}, {1,3,6}, {1,2,4}};

//        int[][]  input =    {{0,2,3}, {1,3,6},{0,4,2},{0,6,5},{1,2,4}};
        int[][]  input =    {{1,3,6},{0,2,3},{0,4,2},{0,6,5},{1,2,4}};


        List<Boolean> result = new ArrayList<>();

      for(int i=0; i<input.length; i++){
          boolean rs = false;
          if(input[i][0] == 1){
              int[] zeroIndxs = zeroIndexes(i, input);
               rs = checkFitness(zeroIndxs,i, input);

              result.add(rs);
          }
      }
        System.out.println(result.toString());
    }

    public static int[] zeroIndexes(int oneIndex, int[][] inputArray){
        int count = 0;
        for(int i=0; i< oneIndex; i++){
            if(inputArray[i][0] == 0){
                count++;
            }
        }

        int[] zeroIndices = new int[count];
        int j = 0;
        for(int i=0; i< oneIndex; i++){
            if(inputArray[i][0] == 0){
                zeroIndices[j] = i;
                j++;
            }
        }


        return zeroIndices;
    }

    public static boolean checkFitness(int[] zeroIndices, int oneIndex, int[][] inputArray) {

        boolean result = true;
        int[] checkDimension = inputArray[oneIndex];

        for (int i = 0; i < zeroIndices.length; i++) {
            int[] innerArray = inputArray[zeroIndices[i]];
            if ((innerArray[1] <= checkDimension[1] && innerArray[2] <= checkDimension[2])
                    || (innerArray[1] <= checkDimension[2]) && innerArray[2] <= checkDimension[1]) {
//                result = true;
            }else {
                return false;
            }
        }

        return true;

    }


}
