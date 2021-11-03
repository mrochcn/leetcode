package com.cuizx.algorithm;

public class FirstBadVersion278 {

    public int firstBadVersion(int n) {
        for (int i = 0; i < n; i++) {
            if (isBadVersion(i)) {
                return i;
            }
        }
        return -1;
    }

    boolean isBadVersion(int version) {
        return true;
    }
}
