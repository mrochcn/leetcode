package com.cuizx.sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 6, 5, 4};
        quickSort(arr,0, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
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
