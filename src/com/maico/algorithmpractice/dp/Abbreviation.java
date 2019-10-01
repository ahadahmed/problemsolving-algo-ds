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
            String result = abbreviation(a, b);
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
        System.out.println(builder.toString());
        return builder.toString();
    }


}
