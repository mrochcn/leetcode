package com.cuizx.math;

import java.util.Arrays;

public class MaxIceCream1833 {
    public static void main(String[] args) {
    }
    public static int maxIceCream(int[] costs, int coins) {
        quickSort(costs,0, costs.length - 1);
        int ans = 0;
        int left = 0;
        while (left < costs.length) {
            if (coins >= costs[left]) {
                coins -= costs[left];
                left++;
                ans++;
            } else {
                break;
            }
        }
        return ans;
    }

    public static void quickSort(int[] arr, int low, int high) {
        int i, j , tmp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        tmp = arr[low];
        while (i < j) {
            while (tmp <= arr[j] && i < j) {
                j--;
            }
            while (tmp >= arr[i] && i < j) {
                i++;
            }
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = tmp;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }

}
