package com.cuizx.interview150;

public class LengthOfLastWorld58 {

    public static int lengthOfLastWord(String s) {
        String[] sArr = s.split(" ");
        return sArr[sArr.length - 1].length();
    }

    public static void main(String[] args) {

    }
}
