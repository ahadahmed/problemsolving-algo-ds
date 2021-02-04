package com.maico.stack;

import java.util.*;

/**
 * @author ahadahmed - 2/3/21
 * @see <a href="https://www.algoexpert.io/questions/Balanced%20Brackets"> see Balanced Bracket</a>
 */
public class BalancedBrackets {

    public boolean isBalanced(String input){
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

   public boolean balancedBracket(String str){

        String openingbrackets = "({[";
        String closingbrackets = ")}]";

       Map<Character, Character> matchingBrackets = new HashMap<>();
       matchingBrackets.put(')', '(');
       matchingBrackets.put('}', '{');
       matchingBrackets.put(']', '[');
       List<Character> stack = new ArrayList<>();

       for(int i=0; i<str.length(); i++){
           char letter = str.charAt(i);
           if( openingbrackets.indexOf(letter) != -1){
               stack.add(letter);
           } else if (closingbrackets.indexOf(letter) != -1) {

               if (stack.size() == 0) {
                   return false;
               }

               if (stack.get(stack.size() - 1) == matchingBrackets.get(letter)) {
                   stack.remove(stack.size() -1);
               }else {
                   return false;
               }

           }
       }


        return stack.size() == 0;
   }

}
