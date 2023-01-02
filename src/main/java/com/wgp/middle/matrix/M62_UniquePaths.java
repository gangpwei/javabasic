package com.wgp.middle.matrix;

/**
 * 不同路径
 * @author gangpeng.wgp
 * @date 2022/11/25 下午4:13
 */
public class M62_UniquePaths {

    /**
     * 动态规划
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] path = new int[m][n];
        //第一列、第一行，所有格子路径数都是1，因为只能横着走或者向下走一条路径
        for (int i = 0; i < m; i++) {
            path[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            path[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                //当前节点路径 = 左边节点路径数 + 上方节点路径数
                path[i][j] = path[i-1][j] + path[i][j-1];
            }
        }
        return path[m-1][n-1];
    }
}
