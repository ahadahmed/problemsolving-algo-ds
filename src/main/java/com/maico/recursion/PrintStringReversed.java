package com.maico.recursion;

public class PrintStringReversed {

    public void reversedString(String inputString) {
        char[] chars = inputString.toCharArray();

        printReversedString(0, chars);
    }

    private void printReversedString(int index, char[] chars) {
        if (chars == null || index >= chars.length) {
            return;
        }

        printReversedString(index + 1, chars);
        System.out.print(chars[index]);
    }
}
