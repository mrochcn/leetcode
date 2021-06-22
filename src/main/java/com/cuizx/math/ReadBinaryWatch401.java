package com.cuizx.math;

import java.util.LinkedList;
import java.util.List;

public class ReadBinaryWatch401 {

    public static void main(String[] args) {
        int turnedOn = 3;
        List<String> list = readBinaryWatch(turnedOn);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new LinkedList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                    ans.add(i + ":" + (j < 10 ? "0" : "") + j);
                }
            }
        }
        return ans;
    }
}
