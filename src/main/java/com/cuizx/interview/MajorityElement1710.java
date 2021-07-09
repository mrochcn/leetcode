package com.cuizx.interview;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement1710 {

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() > nums.length / 2) {
                return integerIntegerEntry.getKey();
            }
        }
        return -1;
    }
}
