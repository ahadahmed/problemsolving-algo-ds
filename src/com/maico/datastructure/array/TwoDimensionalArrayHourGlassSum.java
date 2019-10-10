package com.maico.datastructure.array;

import java.util.Scanner;

public class TwoDimensionalArrayHourGlassSum {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
    }

    private static int hourGlassSum(int[][] hourGlassArray){
        int hourGlassSum = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                hourGlassSum +=hourGlassArray[i][j];
            }
        }
        return hourGlassSum;
    }

    private static void generateHourglass(int[][] originalArray){
        int[][] hourGlass = new int[3][3];

        int startColumn = 0;
        int startRow = 0;

        while (startColumn < 4 && startRow < 4){
            for(int i = startRow; i < 3; i++){
                for (int j = startColumn; j < 3; j++) {
                    hourGlass[i][j] = originalArray[i][j];
                }

            }
        }
    }
}
