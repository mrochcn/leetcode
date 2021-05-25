package com.cuizx.string;

import java.util.HashMap;
import java.util.Map;

public class AimedOfferHammingWeight15 {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(map.get('0'));
        return map.get('1');
    }
}
