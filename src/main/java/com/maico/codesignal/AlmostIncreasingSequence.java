package com.maico.codesignal;

/**
 * @author ahadahmed - 16/11/20
 * @see <a href="#"> see this</a>
 */
public class AlmostIncreasingSequence {

    public static void main(String[] args) {
//        int[] input = {1, 2, 3, 4, 5, 3, 5, 6}; // false
//        int[] input = {40, 50, 60, 10, 20, 30}; // false
//        int[] input = {1, 2, 1, 2}; // false
//        int[] input = {10, 1, 2, 3, 4, 5, 6}; //true
//        int[] input = {1, 2, 3, 4, 3, 6};//true
        int[] input = {1, 2, 3, 4, 99, 5, 6};//true
//       int[] input = {1, 2, 5, 3, 5};//true
        System.out.println(almostIncreasingSequence(input));
    }


    public static boolean almostIncreasingSequence(int[] sequence) {


        int elementCounter = 0;
        int initIndex = 1;
        int preSequenceSize = 1;
        int postSequenceSize = 1;
        int counter = 0;

        for (int i = initIndex; i < sequence.length; i++) {

            if (elementCounter == 1 && sequence[i] > sequence[i - 1]) {
                /*if(i != sequence.length - 1){
                    elementCounter++;
                }*/
                if (preSequenceSize > 1 && i != sequence.length - 1) {

                        elementCounter++;


                }

                if (preSequenceSize > 1 && i == sequence.length -1 && !(sequence[i] > sequence[i - 2])) {
                    elementCounter++;
                }
            }

            if (sequence[i] <= sequence[i - 1]) {
                preSequenceSize = (i - initIndex) + 1;
                elementCounter++;
                initIndex = i;
                counter++;
                postSequenceSize = (i - initIndex) + 1;

            }

            if (elementCounter > 1) {
                return false;
            }
        }

        return true;

    }
}
