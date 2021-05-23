package com.cuizx.topK;

import java.util.*;

public class TopKFrequent692 {
    public static void main(String[] args) {
        String[] s = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(Arrays.toString(topKFrequent(s, 3).toArray()));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<String> list = new LinkedList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            list.add(stringIntegerEntry.getKey());
        }
        //根据map里面的value值进行排序，妙啊
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                return map.get(word1) == map.get(word2) ? word1.compareTo(word2) : map.get(word2) - map.get(word1);
            }
        });
        return list.subList(0, k);
    }
}
