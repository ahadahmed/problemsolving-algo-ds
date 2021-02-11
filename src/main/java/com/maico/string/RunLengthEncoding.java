package com.maico.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ahadahmed - 2/11/21
 * @see <a href="https://www.algoexpert.io/questions/Run-Length%20Encoding"> see this</a>
 */
public class RunLengthEncoding {

    public String runLengthEncoding(String string) {
        List<Character> encodedChars = new ArrayList<>();

        int runningLength = 1;

        for (int i = 1; i < string.length(); i++) {
            Character currentChar = string.charAt(i);
            Character previousChar = string.charAt(i - 1);

            if (currentChar != previousChar || runningLength == 9) {
                encodedChars.add((char) (runningLength + '0'));
                encodedChars.add(previousChar);
                runningLength = 1;
            } else {
                runningLength++;
            }

        }

        encodedChars.add((char) (runningLength + '0'));
        encodedChars.add(string.charAt(string.length() - 1));


        String s = encodedChars.stream().map(String::valueOf).collect(Collectors.joining());


        return s;
    }
}
