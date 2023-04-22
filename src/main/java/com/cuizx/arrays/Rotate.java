package com.cuizx.arrays;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        int k = 6;
        System.out.println("测试中文编码" + Arrays.toString(rotate(nums, k)));
        System.out.println(System.getProperty("file.encoding"));
    }
    public static int[] rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(ans, 0, nums, 0, nums.length);
        return ans;
    }
}
