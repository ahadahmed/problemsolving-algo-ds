package com.maico.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class DocumentGenerationTest {
    private DocumentGeneration documentGeneration;

    @BeforeEach
    void setUp() {
        documentGeneration = new DocumentGeneration();
    }

    @Test
    void generateDocument() {
        String characters= "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";
        boolean actual = documentGeneration.generateDocument(characters, document);
        assertEquals(true, actual);
    }

    @Test
    void generateDocument2() {
        String characters= "helloworldO";
        String document = "hello wOrld";
        boolean actual = documentGeneration.generateDocument(characters, document);
        assertEquals(false, actual);
    }


}