package com.cuizx.string;

import java.util.HashMap;
import java.util.Map;

public class CountOfAtoms726 {
    public static void main(String[] args) {

    }
    public static String countOfAtoms(String formula) {
        char[] chars = formula.toCharArray();
        Map<String, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        while (right < chars.length) {
            if (chars[right] >= 'A' && chars[right] <= 'z') {
                right++;
            } if (Character.isDigit(chars[right])) {
//                map.put()

            }
        }
        return null;
    }
}
