package com.maico.recursion;

public class PrintStringReversed {

    public void reversedString(String inputString) {
        char[] chars = inputString.toCharArray();
        printReversedString(0, chars);
        char[] reversedChars = reverseCharArray(0,chars.length - 1, chars);
        System.out.println(reversedChars);
    }

    private void printReversedString(int index, char[] chars) {
        if (chars == null || index >= chars.length) {
            return;
        }

        printReversedString(index + 1, chars);
        System.out.print(chars[index]);
    }

    private char[] reverseCharArray(int leftIndex, int rightIndex, char[] chars){
        if(leftIndex >= rightIndex){
            return chars;
        }
        char c = chars[leftIndex];
        chars[leftIndex] = chars[rightIndex];
        chars[rightIndex] = c;
        leftIndex++;
        rightIndex --;
        return reverseCharArray(leftIndex, rightIndex, chars);

    }
}
