package com.cuizx.interview150;

public class FirstOccurrenceIndex28 {

    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {

    }
}
