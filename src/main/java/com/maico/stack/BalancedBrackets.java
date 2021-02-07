package com.maico.stack;

import java.util.*;

/**
 * @author ahadahmed - 2/3/21
 * @see <a href="https://www.algoexpert.io/questions/Balanced%20Brackets"> see Balanced Bracket</a>
 */
public class BalancedBrackets {

    public boolean isBalanced(String input){
        System.out.println(System.currentTimeMillis() +":" +Thread.currentThread().getName() + "--"+ Thread.currentThread().getId());
        Map<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put(')', '(');
        matchingBrackets.put('}', '{');
        matchingBrackets.put(']', '[');
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<input.length(); i++){
            Character letter = input.charAt(i);
            if( matchingBrackets.containsValue(letter)){
                stack.push(letter);
            }else if(matchingBrackets.containsKey(letter)){
                try {
                    if (stack.pop() != matchingBrackets.get(letter)) {
                        return false;
                    }
                }catch (NoSuchElementException e){
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }

}
