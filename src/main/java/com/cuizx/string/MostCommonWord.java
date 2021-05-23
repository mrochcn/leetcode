package com.cuizx.string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        String s = mostCommonWord(paragraph, banned);
        System.out.println(s);
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            for (String s : banned) {
                if (s.equals(stringIntegerEntry.getKey())) {
                    map.remove(s);
                }
            }
        }
        Queue<Integer> queue = new PriorityQueue<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            queue.offer(stringIntegerEntry.getValue());
        }
        Integer[] array = (Integer[]) queue.toArray();
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue() == array[array.length - 1]) {
                return stringIntegerEntry.getKey();
            }
        }
        return null;
    }
}
