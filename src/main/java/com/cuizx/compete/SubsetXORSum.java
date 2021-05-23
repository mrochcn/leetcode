package com.cuizx.compete;

import java.util.ArrayList;
import java.util.List;

public class SubsetXORSum {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 1, 6};
        System.out.println(subsetXORSum(nums));
    }

    static List<Integer> t = new ArrayList<Integer>();
    static List<List<Integer>> sets = new ArrayList<List<Integer>>();
    public static int subsetXORSum(int[] nums) {
        int ans = 0;
        dfs(0, nums);
        for (List<Integer> set : sets) {
//            if (set.size() == 1 && set.get(0) == 0) {
//                continue;
//            }
            if (set.size() == 1) {
                ans = ans + set.get(0);
            }
            if (set.size() > 1) {
                for (int i = 1; i < set.size(); i++) {
                    ans = ans + set.get(i) ^ set.get(i - 1);
                }
            }
        }
        return ans;
    }
    public static void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            sets.add(new ArrayList<Integer>(t));
            return;
        }
        t.add(nums[cur]);
        dfs(cur + 1, nums);
        t.remove(t.size() - 1);
        dfs(cur + 1, nums);
    }
}
