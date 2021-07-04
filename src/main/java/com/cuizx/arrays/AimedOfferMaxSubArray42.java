package com.cuizx.arrays;

public class AimedOfferMaxSubArray42 {

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int left = 0, right = 0;
        int n = nums.length;
        int ans = Integer.MIN_VALUE, sum = 0;
        while (right < nums.length) {
            int tmp = nums[right];
            //窗口右侧扩增，求窗口和
            right++;
            sum += tmp;
            // 判断左侧窗口是否要收缩
            while(sum < tmp){
                if(left < right){
                    //左窗口收缩时数据更新
                    sum -= nums[left];
                    left++;
                }
            }
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
