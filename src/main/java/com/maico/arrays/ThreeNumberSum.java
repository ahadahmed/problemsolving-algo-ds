package com.maico.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ahadahmed - 1/7/21
 * @see <a href="#"> see this</a>
 */
public class ThreeNumberSum {

    public static void main(String[] args) {
        int[] inputArray = {12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum =0;
        List<Integer[]> result = threeNumberSum(inputArray, targetSum);
        result.stream().forEach(triplet -> System.out.println(Arrays.toString(triplet)));
    }


    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int left,right;
        Arrays.sort(array);
        ArrayList<Integer[]> result = new ArrayList<>();

        for(int i=0; i< array.length - 1; i++){
            left = i+1;
            right = array.length - 1;
            // int tsen = targetSum - array[i];
            // int sum = array[left] + array[right];
            while(left < right){
                if((targetSum - array[i]) == (array[left] + array[right])){
                    result.add(new Integer[]{array[i], array[left], array[right]});

                    left++;
                    right--;
//                    continue;
                }else{
                    if((array[left] + array[right]) < (targetSum - array[i])){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
