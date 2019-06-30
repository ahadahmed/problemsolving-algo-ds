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


    public void leftRotateByOne(int[] arr){

    }

    public static void main(String[] args) {
        Rotation arrayRotation = new Rotation();
        arrayRotation.usingTempArray(arrayRotation.originalArray, 2);
    }

}
