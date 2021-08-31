package com.mycompany.part11_04saveabledictionary.Dictionary;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");

        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        dictionary.save();
    }

}
