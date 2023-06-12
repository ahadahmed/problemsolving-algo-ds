package com.maico.arrays;


/**
 * @author ahadahmed - 12/06/2023
 * @see <a href="https://www.algoexpert.io/questions/first-duplicate-value"> see this</a>
 */
public class FindFirstDuplicateValue {

    public int firstDuplicateValue(int[] array){

        for(int i=0; i < array.length; i++){
            int index = array.length - Math.abs(array[i]);
            if(array[index] < 0){
                return Math.abs(array[i]);
            }
            array[index] = - array[index];
        }

        return -1;
    }
}
