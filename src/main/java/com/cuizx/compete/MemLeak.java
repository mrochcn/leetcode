package com.cuizx.compete;

import java.util.Arrays;

public class MemLeak {

    public static void main(String[] args) {
        int m1 = 9;
        int m2 = 6;
        System.out.println(Arrays.toString(memLeak(m1, m2)));
    }

    public static int[] memLeak(int memory1, int memory2) {
        int time = 1;
        while (memory1 >= 0 && memory2 >=0 && (memory1 - time) >= 0 || (memory2 - time) >= 0) {
            if (memory1 >= memory2) {
                    memory1 -= time;
                    time++;

            } else {
                    memory2 -= time;
                    time++;
            }
        }
        return new int[]{time, memory1, memory2};
    }
}
