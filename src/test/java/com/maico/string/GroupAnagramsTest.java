package com.maico.string;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    private static GroupAnagrams groupAnagrams;

    @BeforeAll
    static void init(){
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    void groupAnagrams() {
        String[] input = {"yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"};
        List<List<String>> expected = new ArrayList<>();
        List<String> s1 = Arrays.asList(new String[]{"yo", "oy"});
        List<String> s2 = Arrays.asList(new String[]{"act", "tac", "cat"});
        List<String> s3 = Arrays.asList(new String[]{"flop", "olfp"});
        List<String> s4 = Arrays.asList(new String[]{"foo"});
        expected.add(s1);
        expected.add(s2);
        expected.add(s3);
        expected.add(s4);


        List<List<String>> output = groupAnagrams.groupAnagrams(Arrays.asList(input));
        output.stream().forEach(anagrams -> {
            System.out.println(Arrays.toString(anagrams.toArray()));
        });
        assertThat(expected, hasItems(s1, s2, s3,s4));
    }


    @Test
    void groupAnagramsWhenEmpty() {
        String[] input = {""};
        List<List<String>> expected = new ArrayList<>();
        List<String> s = new ArrayList<>();
        expected.add(s);
        List<List<String>> output = groupAnagrams.groupAnagrams(Arrays.asList(input));
        output.stream().forEach(anagrams -> {
            System.out.println(Arrays.toString(anagrams.toArray()));
        });
        assertThat(expected, hasItems(s));

    }

    @Test
    void groupAnagramsWhenSingleEntry() {
        String[] input = {"act"};
        List<List<String>> output = groupAnagrams.groupAnagrams(Arrays.asList(input));
        output.stream().forEach(anagrams -> {
            System.out.println(Arrays.toString(anagrams.toArray()));
        });
    }

    @Test
    void groupAnagrams2() {
        String[] input = {"abc", "dabd", "bca", "cab", "ddba"};
        List<List<String>> output = groupAnagrams.groupAnagrams(Arrays.asList(input));
        output.stream().forEach(anagrams -> {
            System.out.println(Arrays.toString(anagrams.toArray()));
        });
    }
}
