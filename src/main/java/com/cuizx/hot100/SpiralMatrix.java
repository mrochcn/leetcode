package com.cuizx.hot100;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> order = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return order;
        }

        int rows = matrix.length, cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];

        int totals = rows * cols;




        return new ArrayList<>();
    }
}
