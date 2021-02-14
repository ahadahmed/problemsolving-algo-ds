package com.maico.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author ahadahmed - 2/14/21
 * @see <a href="https://www.algoexpert.io/questions/Smallest%20Substring%20Containing"> see this</a>
 */
public class SmallestSubStringContainingPattern {

    public String smallestSubStringContainingPattern(String bigString, String smallString){
        Map<Character, Integer> patternsChars = new HashMap<>();
        Map<Character, Integer> subStringCharCount = new HashMap<>();
        //Create a Map of characters from smallString or pattern
        for(int i = 0; i < smallString.length(); i++){
            Character c = smallString.charAt(i);
            patternsChars.put(c, patternsChars.getOrDefault(c, 0) + 1);
        }

        int windowStart = 0;
        int windowEnd = 0;
        int matchedCharCount = 0;
        int[] subStringIndex= {0, bigString.length()};

        //Iterate all the character of bigString till the end;
        while(windowEnd < bigString.length()){
            Character c = bigString.charAt(windowEnd);

            if(!patternsChars.containsKey(c)){
                windowEnd++;
                continue;
            }

            subStringCharCount.put(c, subStringCharCount.getOrDefault(c,0) + 1);
            if(patternsChars.get(c) == subStringCharCount.get(c)){
                matchedCharCount++;
            }
            while (matchedCharCount == patternsChars.size() && windowStart <= windowEnd) {
                subStringLength(windowStart, windowEnd, subStringIndex);

                Character leftChar = bigString.charAt(windowStart);
                if (!patternsChars.containsKey(leftChar)) {
                    windowStart++;
                    continue;
                }

                if (patternsChars.get(leftChar) == subStringCharCount.get(leftChar)) {
                    matchedCharCount--;
                }
                subStringCharCount.put(leftChar, subStringCharCount.getOrDefault(leftChar, 0) - 1);
                windowStart++;

            }
            windowEnd++;

        }
        String subString = subStringIndex[1] == bigString.length() ? "" : bigString.substring(subStringIndex[0], subStringIndex[1] + 1);

        return subString;
    }

    private int[] subStringLength( int windowStart, int windowEnd, int[] subStringIndex){
        if(windowEnd - windowStart < subStringIndex[1] - subStringIndex[0]){
            subStringIndex[0] = windowStart;
            subStringIndex[1] = windowEnd;
        }
        return subStringIndex;
    }
}
