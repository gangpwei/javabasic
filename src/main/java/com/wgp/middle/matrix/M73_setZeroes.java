package com.wgp.middle.matrix;

/**
 * 矩阵置零
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
class M73_setZeroes {
    //给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。


    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        //用两个标记数组分别记录每一行和每一列是否有零出现。
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
