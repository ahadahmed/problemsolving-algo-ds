package com.maico.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ShortenUnixPathTest {
    private static ShortenUnixPath shortenUnixPath;

    @BeforeAll
    static void init(){
         shortenUnixPath = new ShortenUnixPath();
    }

    @Test
    void shortenUnixRelativePath() {
        String path = "../foo/../test/../test/../foo//bar/./baz";
        String expectedOutputPath = "../foo/bar/baz";
        String shortenedPath = shortenUnixPath.shortenUnixPath(path);
        System.out.println("ShortPath-->"+shortenedPath);
        Assertions.assertEquals(expectedOutputPath,shortenedPath);
    }

    @Test
    void shortenUnixRelativePath2() {
        String path = "../../../foo/../test/../test/../foo//bar/./baz";
        String expectedOutputPath = "../../../foo/bar/baz";
        String shortenedPath = shortenUnixPath.shortenUnixPath(path);
        System.out.println("ShortPath-->"+shortenedPath);
        Assertions.assertEquals(expectedOutputPath,shortenedPath);
    }

    @Test
    void shortenUnixRelativePath3() {
        String path = "..///././../../foo/";
        String expectedOutputPath = "../../../foo";
        String shortenedPath = shortenUnixPath.shortenUnixPath(path);
        System.out.println("ShortPath-->"+shortenedPath);
        Assertions.assertEquals(expectedOutputPath,shortenedPath);
    }

    @Test
    void shortenUnixRelativePath4() {
        String path = "..///././../.././";
        String expectedOutputPath = "../../..";
        String shortenedPath = shortenUnixPath.shortenUnixPath(path);
        System.out.println("ShortPath-->"+shortenedPath);
        Assertions.assertEquals(expectedOutputPath,shortenedPath);
    }

    @Test
    void shortenUnixRelativePath5() {
        String path = "foo/bar/..";
        String expectedOutputPath = "foo";
        String shortenedPath = shortenUnixPath.shortenUnixPath(path);
        System.out.println("ShortPath-->"+shortenedPath);
        Assertions.assertEquals(expectedOutputPath,shortenedPath);
    }




    @Test
    void shortenUnixRelativeToRootPath() {
        String path = "/foo/../test/../test/../foo//bar/./baz";
        String expectedOutputPath = "/foo/bar/baz";
        String shortenedPath = shortenUnixPath.shortenUnixPath(path);
        System.out.println("ShortPath-->"+shortenedPath);
        Assertions.assertEquals(expectedOutputPath,shortenedPath);
    }

    @Test
    void shortenUnixPathOnlyRoot(){
        String path = "/";
        String expectedOutputPath = "/";
        String shortenedPath = shortenUnixPath.shortenUnixPath(path);
        System.out.println("ShortPath-->"+shortenedPath);
        Assertions.assertEquals(expectedOutputPath,shortenedPath);

    }

    @Test
    void shortenUnixPathOnlyRoot2(){
        String path = "/.";
        String expectedOutputPath = "/";
        String shortenedPath = shortenUnixPath.shortenUnixPath(path);
        System.out.println("ShortPath-->"+shortenedPath);
        Assertions.assertEquals(expectedOutputPath,shortenedPath);

    }

    @Test
    void shortenUnixPathOnlyRoot3(){
        String path = "/./../../.";
        String expectedOutputPath = "/";
        String shortenedPath = shortenUnixPath.shortenUnixPath(path);
        System.out.println("ShortPath-->"+shortenedPath);
        Assertions.assertEquals(expectedOutputPath,shortenedPath);

    }
}
