package com.maico.arrays;

/**
 * @author ahadahmed - 13/11/20
 * @see <a href="#"> see this</a>
 */
public class MergeLetter {


    public static void main(String[] args) {
        String s1 = "A2345".toUpperCase();
        String s2 = "C".toUpperCase();
        System.out.println(mergerLetter(s1, s2));
    }


    public static String mergerLetter(String s1, String s2){

        String shorterString;
        String longerString;
        if(s1.length() < s2.length()){
            shorterString = s1;
            longerString = s2;
        }else{
            shorterString = s2;
            longerString = s1;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i < shorterString.length();i++){
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }

        sb.append(longerString.substring(shorterString.length()));


        return sb.toString();
    }
}
