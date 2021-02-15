package com.maico.string;

/**
 * @author ahadahmed - 2/15/21
 * @see <a href="https://www.algoexpert.io/questions/Longest%20Palindromic%20Substring"> see this</a>
 */
public class LongestPalindromicSubstring {
    public String longestPalindromicSubstring(String str) {

        int[] subStrIndex = {0, 1};

        for (int i = 1; i < str.length(); i++) {
            int leftIndex = i - 1;
            int rightIndex = i + 1;

           int[] oddPalindrom = getLongestPalindromFrom(str, leftIndex, rightIndex);
           int[] evenPalindrom = getLongestPalindromFrom(str, leftIndex, i);
           int[] longest = oddPalindrom[1] - oddPalindrom[0] > evenPalindrom[1] - evenPalindrom[0] ? oddPalindrom : evenPalindrom;
           subStrIndex = subStrIndex[1] - subStrIndex[0] > longest[1] - longest[0] ? subStrIndex : longest;
         }
        String result = str.substring(subStrIndex[0], subStrIndex[1]);

        return result;
    }

    private int[] getLongestPalindromFrom(String str, int leftIndex, int rightIndex) {
        while (leftIndex >= 0 && rightIndex < str.length()) {

            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                break;
            }

            leftIndex--;
            rightIndex++;
        }
        return new int[]{leftIndex + 1, rightIndex};
    }
}
