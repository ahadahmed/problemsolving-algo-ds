package com.maico.dynamicprogramming.educative.pattern.slidingwindow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahadahmed - 11/29/20
 * @see <a href="#"> see this</a>
 */
public class ContiguousSubarrayAverage {

    public static void main(String[] args) {
        int[] inputArray = new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        int size = 5;
        System.out.println(averageOfContigiousSubArray(inputArray, 5));
    }

    public static List<Double> averageOfContigiousSubArray(int[] inputArray, int size){
        List<Double> averages = new ArrayList<>();

        double windowSum = 0;
        int windowStart =0;

        for(int windowEnd=0; windowEnd < inputArray.length; windowEnd++){
            windowSum += inputArray[windowEnd];

            if(windowEnd >= size - 1){
                averages.add(windowSum/size);
                windowSum -=inputArray[windowStart];
                windowStart++;
            }
        }


        return averages;
    }
}
