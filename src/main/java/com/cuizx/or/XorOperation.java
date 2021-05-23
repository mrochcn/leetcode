package com.cuizx.or;public class XorOperation {

    public static void main(String[] args) {
        System.out.println(xorOperation(5, 0));
    }

    public static int xorOperation(int n, int start) {
        int ans = 0;
        for (int i = 1; i < n; i++) {
            ans ^= start + i * 2;
        }
        return ans;
    }
}
