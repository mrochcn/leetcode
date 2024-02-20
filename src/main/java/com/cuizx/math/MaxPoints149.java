package com.cuizx.math;


public class MaxPoints149 {

    public static void main(String[] args) {
        int[][] points = new int[][]{{1, 3, 5, 4, 2 ,1},{1, 2, 3, 1, 3, 4}};
        System.out.println(maxPoints(points));
    }

    public static int maxPoints(int[][] points) {
        int n = points.length;
        int ans = 1;
        for (int i = 0; i < n; i++) {
            int[] x = points[i];
            for (int j = i + 1; j < n; j++) {
                int[] y = points[j];
                int cnt = 2;
                for (int k = j + 1; k < n; k++) {
                    int[] p = points[k];
                    int s1 = (y[1] - x[1]) * (p[0] - y[0]);
                    int s2 = (p[1] - y[1]) * (y[0] - x[0]);
                    if (s1 == s2) cnt++;
                }
                ans = Math.max(ans, cnt);
            }
        }
        return ans;
    }
}
