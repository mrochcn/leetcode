package com.cuizx.compete;

import java.util.*;

public class SortSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] strs = s.split(" ");
//        Map<Integer, String> map = new HashMap<>();
//        for (String str : strs) {
//            map.put(Integer.valueOf(str.substring(str.length() - 1)), str.substring(0, str.length() - 1));
//        }
//        String[] strs2 = new String[strs.length];
//        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
//            strs2[integerStringEntry.getKey() - 1] = integerStringEntry.getValue();
//        }
        String[] ans = new String[strs.length];
        for (String str : strs) {
            ans[Integer.valueOf(str.substring(str.length() - 1)) - 1] = str.substring(0, str.length() - 1);
        }
        return Arrays.toString(ans).replace(",","").replace("[","").replace("]","");
    }
}
