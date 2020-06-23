package com.maico.hackerrank.problemsolving.algoritms.warmup;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author ahadahmed - 26/06/2020
 * @see <a href="https://www.hackerrank.com/challenges/compare-the-triplets/problem"> Compare the triplets</a>
 */
public class CompareTheTriplets {

    private final static String FILE_PATH = System.getProperty("user.dir") + "/inputfiles/comparetriplets.txt";

    public static void main(String[] args) {

        File textFile = new File(FILE_PATH);

        List<Integer> aliceInput = null;
        List<Integer> bobInput = null;

        try {
            Scanner filScanner = new Scanner(textFile);
            aliceInput = prepareIntInput(filScanner.nextLine().split(" "));
            bobInput = prepareIntInput(filScanner.nextLine().split(" "));
            aliceInput.forEach(v -> System.out.print(v + " "));
            System.out.println();
            bobInput.forEach(v -> System.out.print(v + " "));
            System.out.println();
            System.out.println(Arrays.toString(compareTriplets(aliceInput, bobInput)));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



    private static List<Integer> prepareIntInput(String[] strInput){
        List<Integer> intInput = Arrays.stream(strInput).map(Integer::parseInt).collect(Collectors.toList());
        return intInput;
    }

    public static int[] compareTriplets(List<Integer> firstInput, List<Integer> secondInput){
        int[] comparisonScore  = {0, 0};
        for (int i = 0;i < firstInput.size(); i++){
            if(firstInput.get(i) > secondInput.get(i)){
                comparisonScore[0] +=1;
            }
            if(firstInput.get(i) < secondInput.get(i)){
                comparisonScore[1] +=1;
            }
        }
        Arrays.asList(comparisonScore);
        return comparisonScore;
    }
}
