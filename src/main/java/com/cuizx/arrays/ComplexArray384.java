package com.cuizx.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComplexArray384 {

    int[] ori;
    int[] nums;

    public ComplexArray384(int[] nums) {
        this.nums = nums;
        ori = new int[nums.length];
        System.arraycopy(nums, 0, ori, 0, nums.length);
    }

    public int[] reset() {
        System.arraycopy(ori, 0, nums, 0, nums.length);
        return nums;
    }

    public int[] shuffle() {
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        int[] ans = new int[list.size()];
        Random r = new Random();
        for (int i = 0; i < nums.length; i++) {
            int idx = r.nextInt(list.size());
            ans[i] = list.remove(idx);
        }
        System.arraycopy(ans, 0, nums, 0, nums.length);
        return nums;
    }
}
