package com.cuizx.arrays;

import com.cuizx.list.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AimedOfferPrintNumbers17 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(2)));
    }
    public static int[] printNumbers(int n) {
        if (n == 0) {
            return new int[]{};
        }

        int length = (int) (Math.pow(10, n) -1);
        System.out.println(length);
        int[] ans = new int[length];
        for (int i = 1; i < length + 1; i++) {
            ans[i - 1] = i;
        }
        return ans;
    }
}
