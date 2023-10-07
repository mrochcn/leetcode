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
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};

        int[] ints = productExceptSelf(nums);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
