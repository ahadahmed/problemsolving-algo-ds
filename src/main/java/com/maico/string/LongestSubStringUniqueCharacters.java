package com.maico.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ahadahmed - 2/10/21
 * @see <a href="http://algoexpert.io/questions/Longest%20Substring%20Without%20Duplication"> see this</a>
 */
public class LongestSubStringUniqueCharacters {

    public String longestSubstringWithoutDuplication(String str) {
        int[] longestSubString = new int[2];
        if (str.length() == 0) {
            return str.substring(longestSubString[0], longestSubString[1]);
        }

        int startIndex = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!charIndexMap.containsKey(currentChar)) {
                charIndexMap.put(currentChar, i);
            } else {
                startIndex = Math.max(startIndex, charIndexMap.get(currentChar) + 1);
                charIndexMap.put(currentChar, i);
            }
            if (i - startIndex > longestSubString[1] - longestSubString[0]) {
                longestSubString[0] = startIndex;
                longestSubString[1] = i;
            }
        }

        String result = str.substring(longestSubString[0], longestSubString[1] + 1);

        return result;
    }
}
