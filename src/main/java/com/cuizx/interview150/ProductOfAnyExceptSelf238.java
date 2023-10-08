package com.cuizx.interview150;

public class ProductOfAnyExceptSelf238 {

    /**
     * 使用模拟会超时
     * @param nums
     * @return
     */
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int temp = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                temp = temp * nums[j];
            }
            ans[i] = temp;
        }

        return ans;
    }

    public static int[]  productExceptSelf1(int[] nums) {
        int[] rArr = new int[nums.length];
        int[] lArr = new int[nums.length];
        int[] ans = new int[nums.length];
        lArr[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            lArr[i] = lArr[i - 1] * nums[i - 1];
        }

        rArr[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rArr[i] = rArr[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = lArr[i] * rArr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};

        int[] ints = productExceptSelf1(nums);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
