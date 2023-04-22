package com.cuizx.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.
 *
 * Note that:
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 * A sequence seq is arithmetic if seq[i + 1] - seq[i] are all the same value (for 0 <= i < seq.length - 1).
 *  
 *
 * Example 1:
 *
 * Input: nums = [3,6,9,12]
 * Output: 4
 * Explanation:  The whole array is an arithmetic sequence with steps of length = 3.
 * Example 2:
 *
 * Input: nums = [9,4,7,2,10]
 * Output: 3
 * Explanation:  The longest arithmetic subsequence is [4,7,10].
 * Example 3:
 *
 * Input: nums = [20,1,15,3,10,5,8]
 * Output: 4
 * Explanation:  The longest arithmetic subsequence is [20,15,10,5].
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-arithmetic-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestArithmeticSubsequence1027 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6, 7};
        int sequence = longestArithSeqLength(arr);
        System.out.println(sequence);
    }
    public static int longestArithSeqLength(int[] nums) {
        Map<Integer, Integer>[] maps = new HashMap[nums.length];
        for (int i = 0; i < maps.length; i++) {
            maps[i] = new HashMap<>();
        }
        int ans = 2;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                //公差
                int key = nums[i] - nums[j];
                int curLen = 0;
                if (maps[j].get(key) == null) {
                    curLen = 2;
                } else {
                    curLen = maps[j].get(key) + 1;
                }
                if (maps[i].get(key) != null) {
                    curLen = Math.max(curLen, maps[i].get(key));
                }
                maps[i].put(key, curLen);
                ans = Math.max(curLen, ans);
            }
        }
        return ans;
    }
}
