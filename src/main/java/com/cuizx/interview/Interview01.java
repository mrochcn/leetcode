package com.cuizx.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interview01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123abccd");
        list.add("abcdc123");
        list.add("1234abc");
        list.add("ab1234cd");
        removeTheSameStr(list);
    }
    public static void removeTheSameStr(List<String> list) {
        Map<Integer, String> map = new HashMap<>();
        List<String> numStrList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] c = list.get(i).toCharArray();
            for (char c1 : c) {
                if (Character.isDigit(c1)) {
                    stringBuilder.append(c1);
                }
            }
            numStrList.add(stringBuilder.toString());
        }
//        for (int i = 0; i < numStrList.size(); i++) {
//            System.out.println(numStrList.get(i));
//        }
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (numStrList.get(i).equals(numStrList.get(i - 1))) {
                System.out.println(i);
                integerList.add(i);
            }
        }
        int idx = 0;
        for (Integer integer : integerList) {
//            System.out.println(list.get(integer));
            list.remove(integer.intValue() - idx);
            idx++;
        }
        for (String s : list) {
            System.out.println(s);
        }
        return;
    }
}
