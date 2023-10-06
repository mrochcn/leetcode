package com.cuizx.interview150;

import java.util.Arrays;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 *
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 *
 *
 * Follow up:
 *
 * Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */

public class RotateArray189 {

    /**
     * 这种方法会超时    考虑新的方法
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
//        for (int i = 0; i < k; i++) {
//            rotateOnce(nums);
//        }

        int[] arr = new int[nums.length];
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            arr[(i + k) % n] = nums[i];
        }
        nums = arr;
    }

    //模拟 这样会超时
    public static void rotateOnce(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }

    //
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3};
        rotateOnce(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
