package com.cuizx.arrays;

import java.util.HashMap;
import java.util.Map;

public class HIndex274 {

    public static void main(String[] args) {

    }

    public int hIndex(int[] citations) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int citation : citations) {
            map.put(citation, map.getOrDefault(citation, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue().equals(integerIntegerEntry.getKey())) {
                return integerIntegerEntry.getKey();
            }
        }
        return 0;
    }
}
