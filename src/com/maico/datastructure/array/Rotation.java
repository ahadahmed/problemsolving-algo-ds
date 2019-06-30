package com.maico.datastructure.array;

import java.util.Arrays;

/**
 * Program for array rotation
 * Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.
 */
public class Rotation {

    private int[] originalArray = { 1, 2, 3, 4, 5, 6, 7 };


    /**
     * array rotation using a temporary array
     */
    public int[] usingTempArray(int[] originalArray, int rotationByNumber){
        int[] rotatedArray = new int[originalArray.length];
        int[] tempArray = new int[rotationByNumber];
        for (int j = 0; j < rotationByNumber; j++ ){
            tempArray[j] = originalArray[j];
        }
        System.out.println(Arrays.toString(tempArray));

        for( int j=rotationByNumber;  j < originalArray.length; j++){
            rotatedArray[j - rotationByNumber] = originalArray[j];
        }
        System.out.println(Arrays.toString(rotatedArray));

        for(int i= 0; i<tempArray.length; i++){
            rotatedArray[rotatedArray.length - (rotationByNumber-i)] = tempArray[i];
        }
        System.out.println(Arrays.toString(rotatedArray));

        return rotatedArray;
    }


    /**
     * array rotaion by reverse algorithm
     */

    public int[] usingReverseAlgorithm(int[] originalArray, int rotaionByNumber){
        reverseArray(originalArray, 0, rotaionByNumber -1);
        reverseArray(originalArray, rotaionByNumber, originalArray.length -1);
        reverseArray(originalArray, 0, originalArray.length -1);
        return originalArray;
    }


    private void reverseArray(int[] arr, int startIndex, int endIndex){

        while(startIndex < endIndex){
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

    }

    public static void main(String[] args) {
        Rotation arrayRotation = new Rotation();
//        arrayRotation.usingTempArray(arrayRotation.originalArray, 2);
        System.out.println("Array before rotation -- " + Arrays.toString(arrayRotation.originalArray));
        arrayRotation.usingReverseAlgorithm(arrayRotation.originalArray, 3);
        System.out.println("Array after rotaion -- "+Arrays.toString(arrayRotation.originalArray));
    }

}
