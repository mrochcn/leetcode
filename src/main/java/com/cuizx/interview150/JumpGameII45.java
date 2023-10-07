package com.cuizx.interview150;

public class JumpGameII45 {

    public static int canJump(int[] nums) {
        int n = nums.length;
        int maxPositiom = 0;
        int end = 0;
        int step = 0;

        for (int i = 0; i < n; i++) {
            maxPositiom = Math.max(maxPositiom, nums[i] + i);
            if (i == end) {
                end = maxPositiom;
                step++;
            }
        }

        return step;



    }
    public static void main(String[] args) {

    }
}
