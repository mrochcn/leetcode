package com.cuizx.hot100;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = nums.length;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (target <= nums[mid]) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

}
