package com.cuizx.math;


import java.math.BigDecimal;
import java.util.Date;

public class AimedOfferMyPow16 {
    public static void main(String[] args) {
        System.out.println(myPow(2.0f, 2147483647));
    }
    public static float myPow(float x, int n) {
        long startTime = System.currentTimeMillis();
        float ans = 1.000000f;
        while (n != 0) {
            if (n > 0) {
                ans = ans * x;
                n--;
            } else {
                ans =  ans * (1 / x);
                n++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time ========>" + (endTime - startTime)/1000 + "s");

        return ans;
    }
}
