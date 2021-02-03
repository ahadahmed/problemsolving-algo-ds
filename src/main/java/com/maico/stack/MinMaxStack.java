package com.maico.stack;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ahadahmed - 2/3/21
 * @see <a href="https://www.algoexpert.io/questions/Min%20Max%20Stack%20Construction"> see MinMaxStack</a>
 */
public class MinMaxStack {

    private final Deque<Integer> stack;
    private Integer min = Integer.MAX_VALUE;
    private Integer max = Integer.MIN_VALUE;

    MinMaxStack(){
        this.stack = new ArrayDeque<>();
    }


    public void push(Integer value){
        this.stack.push(value);

        if(value < min){
            min = value;
        }

        if(value > max){
            max = value;
        }
    }

    public Integer peek(){
        return stack.peek();
    }

    public Integer pop(){
        Integer value = stack.pop();

        List<Integer> rNums = new ArrayList<>(stack);
        Collections.sort(rNums);

        if(rNums.size() == 0){
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
        }else {
            min = rNums.get(0);
            max = rNums.get(rNums.size() - 1);
        }

        return value;
    }


    public Integer getMin(){
        return this.min;
    }

    public Integer getMax(){
        return this.max;
    }


    public void printStack(){
        System.out.println(stack);
    }
}
