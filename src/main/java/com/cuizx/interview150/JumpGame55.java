package com.cuizx.interview150;

public class JumpGame55 {

    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int rightMost = 0;
        for (int i = 0; i < n; i++) {
            if (i > rightMost) {
                return false;
            }
            rightMost =  Math.max(rightMost, i + nums[i]);
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0,0,4};
        boolean b = canJump(nums);
        System.out.println(b);
    }
}
