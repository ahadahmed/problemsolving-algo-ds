package com.maico.algorithmpractice.dp;

import java.io.IOException;
import java.util.Scanner;

public class AbbreviationNew {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        String a = scanner.nextLine();
//        String b = scanner.nextLine();
       /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        for (int qItr = 0; qItr < q; qItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = abbreviation(a, b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();*/
        for (int i = 0; i < q; i++) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
//            String result = abbreviation(a, b);
//            String result = abbreviationWithTwoPointer(a, b);
            System.out.println();
//            System.out.println(result);
        }

        scanner.close();
//        String result = abbreviation(a, b);
//        System.out.println(result);
    }


    private void abbreviation(String input, String result) {
        char[] inputArray = input.toCharArray();
        char[] resultArray = result.toCharArray();

        int i = 0;
        int j = 0;
        char tempPreviousCharacter = '1';
        char previousResultCharacter = '0';

        while (j < result.length()) {

        }

    }

}
