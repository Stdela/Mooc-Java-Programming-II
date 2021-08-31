The basic functionality
For the dictionary, implement a constructor which takes no parameters, and the following methods:

public void add(String words, String translation) adds a word to the dictionary.
Every word has just one translation, and if the same word is added for the second time, nothing happens.
public String translate(String word) returns the translation for the given word. If the word is not in the dictionary, returns null.

Deleting words
Add the dictionary method public void delete(String word) which deletes the given word and its translation from the dictionary.

Reading from file
Make a constructor public SaveableDictionary(String file) and method public boolean load(), which loads the dictionary from the file given to the constructor as a parameter. 
If the program is unable to open the file or read from it, the method returns false, otherwise it returns true.


