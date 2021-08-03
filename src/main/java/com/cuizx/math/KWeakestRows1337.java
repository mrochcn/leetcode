package com.cuizx.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KWeakestRows1337 {

    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length,m=mat[0].length;
        int[][] count = new int[n][2];
        for(int i=0;i<n;i++){
            count[i][1] = i;
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0) break;
                count[i][0]++;
            }
        }
        Arrays.sort(count,(a, b)->(a[0]==b[0]?a[1]-b[1]:a[0]-b[0]));
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = count[i][1];
        }
        return ans;
    }
}
