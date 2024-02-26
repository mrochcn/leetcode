package com.cuizx.hot100;

import java.util.HashMap;
import java.util.HashSet;

public class LongSubsWithoutRepeatCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }
}
