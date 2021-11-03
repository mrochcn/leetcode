package com.cuizx.binarySearch;

public class FindInsertPos35 {
    //二分查找target，如果找不到就返回他的位置
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int mid = -1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                l = mid + 1;
            }
            if (nums[mid] > target) {
                r = mid - 1;
            }
        }
        return mid;
    }
}
