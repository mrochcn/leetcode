package com.cuizx.hot100;

public class MoveZeros {


    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }


}
