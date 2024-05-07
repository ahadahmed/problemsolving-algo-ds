package com.maico.string;

public class ScoreOfaString {

    public int scoreOfString(String s) {
        System.out.println(s);
        char[] asciValues = s.toCharArray();

        int score = 0;
        if(asciValues.length == 1){
            score = asciValues[0];
        }else {
            for (int i = 1; i < asciValues.length; i++) {
                int thisCharAsci = asciValues[i];
                int prevCharAsci = asciValues[i - 1];
                score += Math.abs(thisCharAsci - prevCharAsci);
            }
        }


        System.out.println(score);
        return score;
    }
}
