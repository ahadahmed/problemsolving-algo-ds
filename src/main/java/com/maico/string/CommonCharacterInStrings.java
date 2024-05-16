package com.maico.string;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonCharacterInStrings {

    public String[] commonCharacters(String[] strings) {

        String smallestString= strings[0];

        for(int i=1; i<strings.length; i++){
            if(strings[i].length() < smallestString.length()){
                smallestString = strings[i];
            }

        }
        Set<String> uc =  smallestString.chars().mapToObj(
                 i -> {
                     char c =   (char) i;
                     return String.valueOf(c);
                 }
        ).collect(Collectors.toSet());
        String[] commonchars = new String[uc.size()];
        uc.toArray(commonchars);


        for (String string : strings) {
            Set<String> cuc = string.chars().mapToObj(
                    e -> {
                        char c = (char) e;
                        return String.valueOf(c);
                    }
            ).collect(Collectors.toSet());

            for (String commonchar : commonchars) {
                if (!cuc.contains(commonchar)) {
                    uc.remove(commonchar);
                }
            }

        }
        String[] result = new String[uc.size()];
        uc.toArray(result);

        // Write your code her
        return result;
    }
}
