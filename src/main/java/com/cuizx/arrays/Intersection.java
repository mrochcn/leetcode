package com.cuizx.arrays;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {2, 2};
        System.out.println(Arrays.toString(intersect(a, b)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int nums : nums1) {
            int count = map.getOrDefault(nums, 0) + 1;
            map.put(nums, count);
        }
        int ans[] = new int[nums1.length];
        int pos = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
//                System.out.println(pos);
//                System.out.println(num);
                ans[pos] = num;
                pos++;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(ans, 0, pos);
    }

}
