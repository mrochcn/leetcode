package com.cuizx;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(isExist(arr, 5));
    }

    public static boolean isExist(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[mid] < target) {
                l = mid + 1;
            } else if (arr[mid] > target) {
                r = mid - 1;
            }
        }
        return false;
    }

}
