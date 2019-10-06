package com.maico.algorithmpractice.dp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Abbreviation {


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
            String result = abbreviationWithTwoPointer(a, b);
            System.out.println();
            System.out.println(result);
        }

        scanner.close();
//        String result = abbreviation(a, b);
//        System.out.println(result);
    }


    // Complete the abbreviation function below.
    static String abbreviation(String a, String b) {
        char[] aCharacters = a.toCharArray();
        List<Character> tempCharacterList = new ArrayList<>();

        char previousCharacter = aCharacters[0];
        int bPointer = 0;
        for (int i = 0; i < aCharacters.length; i++) {
            char c = aCharacters[i];
            int ascii = (int) c;
            if (ascii >= 97 && ascii <= 122) {

                if(i > 0){
                    previousCharacter = Character.toUpperCase(aCharacters[i - 1]);

                }
                try {
                    if (b.contains(String.valueOf(c).toUpperCase()) && b.charAt(bPointer) == Character.toUpperCase(c) && Character.toUpperCase(c) != previousCharacter) {
                        tempCharacterList.add(Character.toUpperCase(c));
                        bPointer++;
                    }

                } catch (StringIndexOutOfBoundsException e) {
                    continue;
                }
            } else if (ascii >= 65 && ascii <= 90) {
                if(i > 0){
                    previousCharacter = Character.toUpperCase(aCharacters[i - 1]);

                }
                tempCharacterList.add(c);
                bPointer++;
            }
        }
        if (getStringRepresentation(tempCharacterList).equals(b)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static String getStringRepresentation(List<Character> characters) {
        StringBuilder builder = new StringBuilder(characters.size());
        for (Character ch : characters) {
            builder.append(ch);
        }
//        System.out.println(builder.toString());
        return builder.toString();
    }

    private static String abbreviationWithTwoPointer(String input, String result){
        char[] inputArray = input.toCharArray();
        char[] resultArray = result.toCharArray();
        List<Character> resultString = new ArrayList<>();

        if(input.length() < result.length()){
            return "NO";
        }

        int i = 0;
        int j = 0;
        char tempPreviousCharacter = '1';
        char previousResultCharacter = '0';

        try{


            while (j < result.length()){
                char inputChar = inputArray[i];
                char resultChar = resultArray[j];

                int inputCharAscii = (int) inputChar;
                int resultCharAscii = (int) resultChar;
                if(j > 0){
                    previousResultCharacter = resultArray[j - 1];
                }

                if( inputCharAscii >= 97 && inputCharAscii <= 122){ //character is lowercase

//                check with previous character
                    if(Character.toUpperCase(inputChar) == Character.toUpperCase(tempPreviousCharacter) && Character.toUpperCase(inputChar) != resultChar){ //check with previous character
                        tempPreviousCharacter = inputChar;
                        i++;
                        continue;
                    }else {
                        if(resultChar == Character.toUpperCase(inputChar)){
                            i++;
                            j++;
                            resultString.add(Character.toUpperCase(inputChar));
                            System.out.print(Character.toUpperCase(inputChar));
                            tempPreviousCharacter = inputChar;
                            continue;
                        }else{
                            tempPreviousCharacter = inputChar;
                            i++;
                            continue;
                        }
                    }

                }else if(inputCharAscii >= 65 && inputCharAscii <= 90){ //character is uppercase
                    if(Character.isUpperCase(tempPreviousCharacter) && tempPreviousCharacter == inputChar && inputChar != resultChar && inputChar != previousResultCharacter){
                        getStringRepresentation(resultString);
                        System.out.println("Previous charter uppercase && input uppercase && input != result");
                        System.out.println("input: "+i +" output:" + j );
                        return "NO";
                    }
                    if(Character.toUpperCase(tempPreviousCharacter) == inputChar){ // Does InputCharacter is equal Previous character
                        tempPreviousCharacter = inputChar;
                        i++;
                        if(inputChar == resultChar){
                            j++;
                            resultString.add(Character.toUpperCase(inputChar));
                            System.out.print(Character.toUpperCase(inputChar));
                        }
                        continue;
                    }
//                    if(i > 2 && )
                    if(inputChar == resultChar){
                        tempPreviousCharacter = inputChar;
                        i++;
                        j++;
                        resultString.add(Character.toUpperCase(inputChar));
                        System.out.print(Character.toUpperCase(inputChar));
                        continue;
                    }else {
                        getStringRepresentation(resultString);
                        System.out.println("Input Uppercase && not equal result character");
                        System.out.println("input: "+i +" output:" + j );
//                        i++;
//                        continue;
                        return "NO";
                    }


                }
            }

            while (i < inputArray.length){
                if(Character.isUpperCase(inputArray[i])){
                    getStringRepresentation(resultString);
                    System.out.println("index out: input: "+i +" output:" + j );
                    return "NO";
                }
                i++;
            }



        }catch (ArrayIndexOutOfBoundsException e){
            getStringRepresentation(resultString);
            System.out.println("input: "+i +"output:" + j );
            return "NO";
        }


        getStringRepresentation(resultString);

        return "YES";

    }


}
