package com.maico.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author ahadahmed - 23/6/20
 * @see <a href="#"> see this</a>
 */
public class Utils {
    private static String PATH = System.getProperty("user.dir") + "/inputfiles/";

    private static String FILE_NAME;

    private static Scanner scanner = null;

    public static Scanner getFilScanner()  {
        return scanner;
    }

    public static void setFileName(String fileName){
        FILE_NAME = fileName;
        PATH =PATH + fileName;
        createScanner(PATH);
    }

    public static String  getFileName(){
        return FILE_NAME;
    }

    private static void createScanner(String path){
        File FILE = new File(path);
        try {
            scanner = new Scanner(FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
