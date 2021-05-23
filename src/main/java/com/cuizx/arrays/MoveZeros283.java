package com.cuizx.arrays;

import java.util.Arrays;

public class MoveZeros283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 2, 3};
        System.out.println(Arrays.toString(moveZeros(nums)));
    }
    public static int[] moveZeros(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[count] = num;
                count++;
            }
        }
        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
