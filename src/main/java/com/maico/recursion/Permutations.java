package com.maico.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public void permutations(List<Integer> inputArray){
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutations(inputArray, new ArrayList<>(), permutations);
        System.out.println(Arrays.toString(permutations.toArray()));

    }


    public void getPermutations(List<Integer> array, List<Integer> currentPerm, List<List<Integer>> permutations){
        if(array.size() == 0 && currentPerm.size() > 0){
            permutations.add(currentPerm);
        }else {

            for (int i = 0; i < array.size(); i++) {
                List<Integer> newPermutation = new ArrayList<>(currentPerm);
//                List<Integer> newArray = new ArrayList<>(array);
//                Integer currentNum = newArray.remove(i);
//                newPermutation.add(currentNum);


                List<Integer> newArray = new ArrayList<>();
//                List<Integer> preSub = array.subList(0, i);
//                List<Integer> postSub = array.subList(i + 1, array.size());
//                newArray.addAll(preSub);
//                newArray.addAll(postSub);
                newArray.addAll(array.subList(0, i));
                newArray.addAll(array.subList(i+1, array.size()));
                newPermutation.add(array.get(i));

                getPermutations(newArray, newPermutation, permutations);
            }
        }





    }
}
