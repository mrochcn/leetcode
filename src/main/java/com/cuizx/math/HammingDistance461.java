package com.cuizx.math;

public class HammingDistance461 {
    public static void main(String[] args) {
        hammingDistance(4, 1);
    }
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
