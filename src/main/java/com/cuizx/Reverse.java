package com.cuizx;


/**
 * reverse the Integer
 */
public class Reverse {
    public static void main(String[] args) {
        int x = 321;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int idx = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && idx > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && idx < -8)) {
                return 0;
            }
            ans = ans * 10 + idx;
            x = x /10;
        }
//        System.out.println(ans);
        return ans;
    }
}
