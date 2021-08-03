package com.cuizx.arrays;

public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        digits[n - 1] = digits[n - 1] + 1;
        return digits;
    }
}
