package com.cuizx.arrays;


public class FindMaximumXOR421 {

    public static void main(String[] args) {
        int[] nums = new int[]{8, 10, 2};
        int maximumXOR = findMaximumXOR(nums);
        System.out.println(maximumXOR);

    }

    public static int findMaximumXOR(int[] nums) {
        int max = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i] ^ nums[i - 1]);
        }
        return max;
    }
}
