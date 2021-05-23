package com.cuizx.compete;

import java.util.HashMap;
import java.util.Map;

public class MaxDistance {
    public static void main(String[] args) {

    }

    public int maxDistance(int[] nums1, int[] nums2) {
        int ans = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i; j < nums2.length; j++) {
                if (nums1[i] <= nums2[j]) {
                    ans = Math.max(j - i, ans);
                }
            }
        }
        return  ans;
    }
}
