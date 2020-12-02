package com.maico.dynamicprogramming.educative.pattern.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ahadahmed - 12/2/20
 * @see <a href="#"> see this</a>
 */
public class LongestSubStringWithKDistinctCharacter {

    public static void main(String[] args) {
        String inputString = "araaci";
        int distinctNumberCount = 2;
        int length = subStringLengthOfKDistinctCharacter(inputString, distinctNumberCount);
        System.out.println(length);

    }


    public static Integer subStringLengthOfKDistinctCharacter(String inputString, int numberOfDistinctChars) {
        long startTime = System.currentTimeMillis();

        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();


        for (int windowEnd = 0; windowEnd < inputString.length(); windowEnd++) {
            Character c = inputString.charAt(windowEnd);
            characterFrequencyMap.put(c, characterFrequencyMap.getOrDefault(c, 0) + 1);

            while (characterFrequencyMap.size() > numberOfDistinctChars) {
                Character leftChar = inputString.charAt(windowStart);
                characterFrequencyMap.put(leftChar, characterFrequencyMap.get(leftChar) - 1);
                if (characterFrequencyMap.get(leftChar) == 0) {
                    characterFrequencyMap.remove(leftChar);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, (windowEnd - windowStart) + 1);

        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time -->"+ (endTime - startTime) +"ms");
        return maxLength;
    }
}
