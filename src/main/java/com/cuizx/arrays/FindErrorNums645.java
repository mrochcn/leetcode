package com.cuizx.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindErrorNums645 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 4};
        int[] errorNums = findErrorNums(arr);
    }

    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            int count = map.getOrDefault(i, 0);
            if (count == 0) {
                ans[1] = i;
            } else if (count == 2) {
                ans[0] = i;
            }
        }
        return ans;
    }
}
