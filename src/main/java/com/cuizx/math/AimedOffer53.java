package com.cuizx.math;

public class AimedOffer53 {

    public int search(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
