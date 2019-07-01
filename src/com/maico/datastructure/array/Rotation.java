package com.maico.datastructure.array;

import java.util.Arrays;

/**
 * Program for array rotation
 * Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.
 */
public class Rotation {

    private int[] originalArray = { 1, 2, 3, 4, 5, 6, 7 };


    /**
     * rotating an array by 'd' elements using a temporary array
     * @param originalArray
     * @param numberOfElementsTobeRotated
     * @return
     */
    public int[] usingTempArray(int[] originalArray, int numberOfElementsTobeRotated){
        int[] rotatedArray = new int[originalArray.length];
        int[] tempArray = new int[numberOfElementsTobeRotated];
        for (int j = 0; j < numberOfElementsTobeRotated; j++ ){
            tempArray[j] = originalArray[j];
        }
        System.out.println(Arrays.toString(tempArray));

        for( int j=numberOfElementsTobeRotated;  j < originalArray.length; j++){
            rotatedArray[j - numberOfElementsTobeRotated] = originalArray[j];
        }
        System.out.println(Arrays.toString(rotatedArray));

        for(int i= 0; i<tempArray.length; i++){
            rotatedArray[rotatedArray.length - (numberOfElementsTobeRotated-i)] = tempArray[i];
        }
        System.out.println(Arrays.toString(rotatedArray));

        return rotatedArray;
    }


    /**
     * method for rotating an array by 'd' elements using reverse algorithm
     * @param originalArray
     * @param numberOfElementsTobeRotated
     * @return
     */

    public int[] usingReverseAlgorithm(int[] originalArray, int numberOfElementsTobeRotated){
        reverseArray(originalArray, 0, numberOfElementsTobeRotated -1);
        reverseArray(originalArray, numberOfElementsTobeRotated, originalArray.length -1);
        reverseArray(originalArray, 0, originalArray.length -1);
        return originalArray;
    }




    /**
     * method for reversing an array
     * @param array
     * @param startIndex
     * @param endIndex
     */


    private void reverseArray(int[] array, int startIndex, int endIndex){

        while(startIndex < endIndex){
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

    }


    /**
     * Method for rotating array in cyclic order by one (clockwise)
     * @param originalArray
     * @return
     */

    public int[] cyclicRotation(int[] originalArray){
        int temp = originalArray[originalArray.length - 1];

        for(int i = originalArray.length -2; i >=0 ; i--){
            originalArray[i+1] = originalArray[i];
        }
        originalArray[0] = temp;


        return originalArray;
    }

    public static void main(String[] args) {
        Rotation arrayRotation = new Rotation();
//        arrayRotation.usingTempArray(arrayRotation.originalArray, 2);
        System.out.println("Array before rotation -- " + Arrays.toString(arrayRotation.originalArray));
//        arrayRotation.usingReverseAlgorithm(arrayRotation.originalArray, 3);
        arrayRotation.cyclicRotation(arrayRotation.originalArray);
        System.out.println("Array after rotaion -- "+Arrays.toString(arrayRotation.originalArray));
    }

}
