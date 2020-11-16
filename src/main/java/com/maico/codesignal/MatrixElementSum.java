package com.maico.codesignal;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ahadahmed - 16/11/20
 * @see <a href="#"> see this</a>
 */
public class MatrixElementSum {

    public static void main(String[] args) {
        int[][] matriz =
                {
                        {0, 1, 1, 2},
                        {0, 5, 0, 0},
                        {2, 0, 3, 3}
                };//9
        System.out.println(matrixElementsSum(matriz));
    }

    public static int matrixElementsSum(int[][] matrix) {
        int sum = 0;
        Map<Integer, Boolean> hauntedCol = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 && hauntedCol.get(j) == null) {
                    sum += matrix[i][j];
                } else {
                    hauntedCol.put(j, true);
                }
            }
        }

        return sum;
    }
}
