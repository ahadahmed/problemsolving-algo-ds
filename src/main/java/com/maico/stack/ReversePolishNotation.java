package com.maico.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReversePolishNotation {

    private final Deque<Integer> stack;

    public ReversePolishNotation() {
        stack = new ArrayDeque<>();
    }

    public int evaluateReversePolishNotation(String[] tokens){

        Integer result = null;

        for(int i = 0; i < tokens.length; i++){
            String token = tokens[i];

            if(token.equals( "+") || token.equals( "-") || token.equals( "*" )  ||  token.equals( "/")){
                Integer secondOperand = stack.pop();
                Integer firstsOperand = stack.pop();

                switch (token){
                    case "+":
                        result = firstsOperand + secondOperand;
                        break;

                    case "-":
                        result = firstsOperand - secondOperand;
                        break;
                    case "*":
                        result = firstsOperand * secondOperand;
                        break;
                    case "/":
                        result = firstsOperand / secondOperand;
                        break;
                }

                stack.push(result);
            }else {
                stack.push(Integer.parseInt(token));
            }

        }


        return stack.pop();
    }
}
