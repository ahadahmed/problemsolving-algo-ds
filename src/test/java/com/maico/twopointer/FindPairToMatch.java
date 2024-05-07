package com.maico.twopointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairToMatch {

    public int[] findPairValues(int matchValue, int[] pairValues){
        int[] matchingPairs = new int[2];

        Map<Integer, Boolean> pairValueMap = new HashMap<>();


        for (int pairValue : pairValues) {
            int otherPair = matchValue - pairValue;
            Boolean otherPairExists = pairValueMap.get(otherPair);
            if (otherPairExists != null && otherPairExists) {
                matchingPairs[0] = pairValue;
                matchingPairs[1] = otherPair;
                break;
            } else {
                pairValueMap.put(pairValue, true);
            }


        }

        return matchingPairs;
    }

    public int[] findPairValueNLogN(int matchValue, int[] pairValues){
        int[] matchingPairs = new int[2];

        int[] sortedPairValues = Arrays.stream(pairValues).sorted().toArray();

        int leftPointer = 0;
        int rightPointer = sortedPairValues.length - 1;

        while(leftPointer < rightPointer){
            int sum = sortedPairValues[leftPointer] + sortedPairValues[rightPointer];

            if(sum == matchValue){
                matchingPairs[0] = sortedPairValues[leftPointer];
                matchingPairs[1] = sortedPairValues[rightPointer];
                break;
            }else {
                if(sum > matchValue){
                    rightPointer --;
                }
                if (sum < matchValue){
                    leftPointer++;
                }
            }


        }




        return matchingPairs;
    }
}
