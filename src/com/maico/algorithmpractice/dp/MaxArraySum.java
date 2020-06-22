package com.maico.algorithmpractice.dp;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
//initial commit
public class MaxArraySum {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int numberOfElements = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] inputArray = new int[numberOfElements];
        String[] arrayItems = scanner.nextLine().split(" ");

        for(int i=0; i < arrayItems.length; i++){
            inputArray[i] = Integer.valueOf(arrayItems[i]);
        }
        System.out.println(Arrays.toString(inputArray));
        int maxSubsetSum = maxSubsetSum(inputArray);
        System.out.println("Max Sum -- "+ maxSubsetSum);

    }

    private static int maxSubsetSum(int[] inputArray){
        int sumInclusiveCurrentElement = inputArray[0];
        int sumExclusiveCurrentElement = 0;
        int tempMax;

        for(int i = 1; i< inputArray.length; i++){
            tempMax = (sumInclusiveCurrentElement > sumExclusiveCurrentElement) ? sumInclusiveCurrentElement : sumExclusiveCurrentElement;
            sumInclusiveCurrentElement = sumExclusiveCurrentElement + inputArray[i];
            sumExclusiveCurrentElement = tempMax;
        }

        return (sumInclusiveCurrentElement > sumExclusiveCurrentElement) ? sumInclusiveCurrentElement : sumExclusiveCurrentElement;

    }

}
