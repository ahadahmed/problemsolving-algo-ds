package com.maico.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *Given an array of integer [numbs] and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because numbers[0] + numbers[1] == 9, we return [0, 1].
 *
 * @author ahadahmed - 13/11/20
 * @see <a href="#"> see this</a>
 */
public class TwoNumberSum {

/**
 *
 * @param numbers array of distinct integer
 * @param target integer representing target sum of {@code numbers}
 * @return {@code array} of indices of {@code numbers} or empty array if not present
 *
 */

    public  int[] findNumbersThatSumsUpTarget(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[] {  map.get(complement), i };
            }
            map.put(numbers[i], i);
        }
        return new int[0];
    }
}
