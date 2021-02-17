package com.maico.arrays;

/**
 * @author ahadahmed - 2/17/21
 * @see <a href="https://www.algoexpert.io/questions/Shifted%20Binary%20Search"> see this</a>
 * @see <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/"> see this</a>
 */
public class RotatedSortedArraySearch {

    public int search(int[] array, int target){

        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(array[mid] == target){
                return mid;
            }
            if(array[left] <= array[mid]){
                if(target <= array[mid] && target >= array[left]){
                    right = mid;
                }else {
                    left = mid + 1;
                }

            }else{
                if(target >=array[mid] && target <= array[right]){
                    left = mid + 1;
                }else {
                    right = mid;
                }
            }
        }

        return -1;
    }


}
