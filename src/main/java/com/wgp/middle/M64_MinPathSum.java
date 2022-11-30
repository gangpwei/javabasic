package com.wgp.middle;

/**
 * 最小路径和
 * @author gangpeng.wgp
 * @date 2022/11/25 下午4:13
 */
public class M64_MinPathSum {

    //给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
    //
    //说明：每次只能向下或者向右移动一步。

    /**
     * 动态规划
     * @return
     */
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] sum = new int[m][n];
        sum[0][0] = grid[0][0];

        //第一列、第一行
        for (int i = 1; i < m; i++) {
            sum[i][0] = sum[i-1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            sum[0][j] = sum[0][j-1] + grid[0][j];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                //当前节点路径和 = Min( 左边节点路径和 , 上方节点路径和) + 当前值
                sum[i][j] = Math.min(sum[i-1][j] , sum[i][j-1]) + grid[i][j];
            }
        }
        return sum[m-1][n-1];
    }
}
