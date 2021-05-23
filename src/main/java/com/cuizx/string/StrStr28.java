package com.cuizx.string;

public class StrStr28 {

    public static void main(String[] args) {

    }

    public static int strStr(String haystack, String needle) {
        if (needle == null) {
            return -1;
        }
        int hLen = haystack.length(), nLen = needle.length();
        for (int i = 0; i < hLen - nLen + 1; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
