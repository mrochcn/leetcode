package com.cuizx.arrays;

public class FindPeekElement162 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        if (nums.length == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }
        if (nums.length == 1) {
            return 0;
        }
        int i = 1;
        while (i < nums.length - 1) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
