package com.maico.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author ahadahmed
 * @see <a href="#"> see this</a>
 */
public class MinRewards {

    public int minRewards(int[] scores){

        int minReward = 0;
        int[] rewards = new int[scores.length];
        Arrays.fill(rewards, 1);

        for(int i=1; i < scores.length; i++){
            if(scores[i] > scores[i - 1]){
                rewards[i] = rewards[i-1] + 1;
            }
        }

        for(int i=scores.length - 2; i >=0 ; i--){
            if(scores[i] > scores[i+1]){
                rewards[i] = Math.max(rewards[i], rewards[i+1] + 1);
            }
        }

        System.out.println(Arrays.toString(rewards));


        minReward = Arrays.stream(rewards).sum();

        return minReward;
    }
}
