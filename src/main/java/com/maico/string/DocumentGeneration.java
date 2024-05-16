package com.maico.string;

import java.util.HashMap;
import java.util.Map;

public class DocumentGeneration {

    public boolean generateDocument(String characters, String document) {

        boolean result = true;

        Map<Character, Integer> documentFrq = new HashMap<>();
        Map<Character, Integer> charFrq = new HashMap<>();



        for(int i = 0; i< characters.length(); i++){
            char c = characters.charAt(i);
            Integer dcFrq = charFrq.getOrDefault(c, 0);
            charFrq.put(c, dcFrq +1);
        }

        for(int i = 0; i< document.length(); i++){
            char c = document.charAt(i);

            Integer dcFrq = documentFrq.getOrDefault(c, 0);
            documentFrq.put(c, dcFrq +1);
        }

        for(int i = 0; i< document.length(); i++){
            char c = document.charAt(i);

            if(documentFrq.get(c) > charFrq.getOrDefault(c, 0)){
                result = false;
            }
        }




        return result;
    }
}
