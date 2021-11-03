package com.cuizx.design;

import java.util.ArrayList;
import java.util.List;

public class WordDictionary211 {
    List<String> dictionary;


    public WordDictionary211() {
        dictionary = new ArrayList<>();
    }

    public void addWord(String word) {
        dictionary.add(word);
    }

    public boolean search(String word) {
        return dictionary.contains(word);
    }
}
