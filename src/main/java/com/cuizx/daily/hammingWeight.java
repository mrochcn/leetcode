package com.cuizx.daily;

import java.util.HashMap;
import java.util.Map;

public class hammingWeight {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        if (n == 0) {
            return 0;
        }
        String s = Integer.toBinaryString(n);
        System.out.println(n);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(map.get('0'));
        return map.get('1');
    }
}
