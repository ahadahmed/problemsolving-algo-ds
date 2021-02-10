package com.maico.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ahadahmed - 2/10/21
 * @see <a href="https://www.algoexpert.io/questions/Group%20Anagrams"> see this</a>
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(List<String> words) {
        List<List<String>> anagramsGroup = new ArrayList<>();

        Map<String, List<String>> m = new HashMap<>();
        List<String> anagrams;

        for(String word : words){
            String sortedWord = word.chars()
                    .sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            if(m.containsKey(sortedWord)){
                m.get(sortedWord).add(word);
            }else {
               anagrams = new ArrayList<>();
               anagrams.add(word);
               m.put(sortedWord, anagrams);
               anagramsGroup.add(anagrams);
            }
        }


        return anagramsGroup;
    }
}
