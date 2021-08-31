package com.mycompany.part11_04saveabledictionary.Dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//public String translate(String word) returns the translation for the given word. If the word is not in the dictionary, returns null.
/**
 *
 * @author delam
 */
public class SaveableDictionary {

    private HashMap<String, String> words = new HashMap<>();
    private String file;

    public SaveableDictionary() {
    }

    public SaveableDictionary(String file) {
        this.file = file;
    }

    public void add(String words, String translation) {
        if (!(this.words.containsKey(words))) {
            this.words.put(words, translation);
        }
    }

    public String translate(String word) {
        if (this.words.containsKey(word)) {
            return this.words.get(word);
        }
        if (this.words.containsValue(word)) {
            for (Map.Entry<String, String> object : this.words.entrySet()) {
                if (object.getValue().equals(word)) {
                    return object.getKey();
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        if (this.words.containsKey(word)) {
            Iterator it = this.words.keySet().iterator();
            while (it.hasNext()) {
                String palabra = (String) it.next();
                if (palabra.equals(word)) {
                    it.remove();
                }

            }

        }
        if (this.words.containsValue(word)) {
            Iterator it = this.words.values().iterator();
            while (it.hasNext()) {
                String traduccion = (String) it.next();
                if (traduccion.equals(word)) {
                    it.remove();
                }
            }
        }
    }

    public boolean load() {
        try {
            Scanner scanner = new Scanner(Paths.get(this.file));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                String word = parts[0];
                String translation = parts[1];
                this.words.put(word, translation);

            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() throws IOException {
        try (PrintWriter writer = new PrintWriter(this.file)) {
            for (String key : this.words.keySet()) {
                writer.append(key + ":" + this.words.get(key) + "\n");
            }
            return true;
        } catch (Exception e) {
            return false;
        }

//// Part of the following code was copied from somewhere else. Credits to KiwiCode on GitHub
//
//        List<String> allreadySaved = new ArrayList<>();
//FileWriter writer = new FileWriter(this.file);
//        words.keySet().stream().forEach((String word) -> {
//
//            if (allreadySaved.contains(word)) {
//
//                return;
//
//            }
//
// 
//
//            String pari = word + ":" + words.get(word);
//
//            try {
//                writer.write(pari);
//            } catch (IOException ex) {
//                Logger.getLogger(SaveableDictionary.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            allreadySaved.add(word);
//
//            allreadySaved.add(words.get(word));
//
//        });
    }
}
