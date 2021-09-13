package com.maico.string;

public class CaesarCipher {

    public String caesarCipherEncryptor(String input, int key){

        char[] chars = new char[input.length()];
        key = key % 26;
        for(int i=0; i < input.length(); i++){
            int c = input.charAt(i);
            int nlc = c + key;
            if (nlc > 122) {
                nlc = 96 + nlc % 122;
            }
            chars[i] = (char) nlc;
        }


        return new String(chars);
    }
}
