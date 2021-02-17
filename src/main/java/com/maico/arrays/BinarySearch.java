package com.maico.arrays;

/**
 * @author ahadahmed - 2/17/21
 * @see <a href="#"> see this</a>
 */
public class BinarySearch {

    public int binarySearch(int[] array, int target){

        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(target == array[mid]){
                return mid;
            }

            if(target < array[mid]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }

        }

        return -1;
    }
}
