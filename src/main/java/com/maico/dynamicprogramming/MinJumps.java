package com.maico.dynamicprogramming;

/**
 * @author ahadahmed
 * @see <a href="https://www.algoexpert.io/questions/Min%20Number%20Of%20Jumps"> see this</a>
 */
public class MinJumps {

    public int minNumberOfJumps(int[] array){
        if(array.length == 1){
            return 0;
        }
        int maxReach = array[0];
        int steps = array[0];
        int minJumps = 0;
        for(int i=1; i < array.length - 1; i++){
            maxReach = Math.max(maxReach, i + array[i]);
            steps--;
            if(steps == 0){
                minJumps++;
                steps = maxReach - i;
            }
        }
        return minJumps + 1;
    }
}
