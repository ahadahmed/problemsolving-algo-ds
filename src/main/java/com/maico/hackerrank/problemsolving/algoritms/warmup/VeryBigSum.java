package com.maico.hackerrank.problemsolving.algoritms.warmup;

import com.maico.hackerrank.Utils;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ahadahmed - 23/6/20
 * @see <a href="https://www.hackerrank.com/challenges/a-very-big-sum/problem"> A Very Big Sum</a>
 */
public class VeryBigSum {



    public static void main(String[] args) {
        Utils.setFileName("verybigsum.txt");
        Scanner scanner = Utils.getFilScanner();
        int numberOfInputs = scanner.nextInt();
        System.out.println(numberOfInputs);
        scanner.skip("\n");
        String[] bigIntegers = scanner.nextLine().split(" ");
//        scanner.skip("\n");
        System.out.println(Arrays.toString(bigIntegers));

    }

}
