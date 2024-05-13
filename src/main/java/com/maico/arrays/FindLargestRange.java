package com.maico.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindLargestRange {

    public int[] largestRange(int[] array) {
        int[] result = new int[2];

        Map<Integer, Boolean> tracker = new HashMap<>();
        Arrays.stream(array).forEach( i -> tracker.put(i, false));
        int i = 0;
        while (i < array.length){
            int currentNumber = array[i];

            int leftRange = currentNumber;
            int rightRange = currentNumber;


            Boolean isVisited = tracker.get(currentNumber);

            while (tracker.get(currentNumber) != null && !isVisited) {
                    tracker.put(currentNumber, true);
                    if(currentNumber  < leftRange)
                        leftRange  = currentNumber;
                    currentNumber -= 1;

            }
            currentNumber  = array[i];
            while (tracker.get(currentNumber) != null && !isVisited) {
                tracker.put(currentNumber, true);
                if(currentNumber > rightRange)
                 rightRange  = currentNumber;
                currentNumber += 1;

            }

           i++;
            if((rightRange - leftRange) >=  (result[1] - result[0])){
                result[0]= leftRange;
                result[1] = rightRange;

            }
        }

        return result;
    }
}
