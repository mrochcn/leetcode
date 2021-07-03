package com.cuizx.arrays;

import java.util.*;

public class FrequencySort451 {

    public static void main(String[] args) {
        String a = "tree";
        System.out.println(frequencySort(a));
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
            list.add(aChar);
        }
        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return map.get(o2) - map.get(o1);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : list) {
            while (map.get(character) > 0) {
                stringBuilder.append(character);
                map.put(character, map.get(character) - 1);
            };
        }
        return stringBuilder.toString();
    }
}
