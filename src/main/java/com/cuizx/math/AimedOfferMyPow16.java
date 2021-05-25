package com.cuizx.math;

public class AimedOfferMyPow16 {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, -2));
    }
    public static double myPow(double x, int n) {
        double ans = 1.0;
        while (n != 0) {
            if (n > 0) {
                ans = ans * x;
                n--;
            } else if (n < 0) {
                ans =  ans * (1 / x);
                n++;
            } else {
                return 1;
            }
        }

        return ans;
    }
}
