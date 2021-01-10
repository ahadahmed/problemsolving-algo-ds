package com.maico.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * @author ahadahmed - 13/11/20
 * @see <a href="#"> see this</a>
 */
public class TwoSumLeetcode {


    public static void main(String[] args) {

    }


    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {  map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
