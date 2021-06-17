package com.cuizx.math;

public class GuessNumber374 {

    public int guess(int n, int des) {
        if (n > des) {
            return 1;
        } else if (n < des) {
            return -1;
        } else {
            return 0;
        }
    }

    public int guessNumber(int n) {
        int a = (int) (Math.random() + n);
        while (guess(a, 6) != 0) {
            if (guess(a, 6) == 1) {
                a--;
            } else {
                a++;
            }
        }
        return a;
    }

}
