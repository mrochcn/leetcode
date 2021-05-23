package com.cuizx.compete;

import java.util.Arrays;

public class RotateTheBox {
    public static void main(String[] args) {
        char[][] ch = new char[2][4];
        ch[0][0] = '#';
        ch[1][0] = '#';
        ch[1][1] = '#';
        ch[0][2] = '*';
        ch[1][2] = '*';
        char[][] as = rotateTheBox(ch);

//        System.out.println(Arrays.toString(Arrays.stream(ch).toArray()));
        for (int i = 0; i < ch.length; i++) {
            System.out.println(Arrays.toString(ch[i]));
        }
    }
    public static char[][] rotateTheBox(char[][] box) {
        char[][] ans = new char[box[0].length][box.length];
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[0].length; j++) {
                ans[j][i] = box[i][j];
            }
        }
        return ans;
    }
}
