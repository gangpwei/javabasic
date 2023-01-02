package com.wgp.middle.matrix;

/**
 * 不同路径，带障碍物
 * @author gangpeng.wgp
 * @date 2022/11/25 下午4:13
 */
public class M63_UniquePathsWithObstacles {

    /**
     * 动态规划
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] path = new int[m][n];
        //第一列、第一行，所有格子路径数都是1，因为只能横着走或者向下走一条路径
        //如果前一个节点，不通，则路径数设为0
        for (int i = 0; i < m; i++) {
            if(i > 0){
                //看前一个节点能不能通
                path[i][0] = path[i-1][0] == 0 || obstacleGrid[i][0] == 1 ? 0 : 1;
            }else{
                path[i][0] = obstacleGrid[i][0] == 1 ? 0 : 1;
            }
        }
        for (int j = 0; j < n; j++) {
            if(j>0){
                //看前一个节点能不能通
                path[0][j] = path[0][j-1] == 0 || obstacleGrid[0][j] == 1 ? 0 : 1;
            }else{
                path[0][j] = obstacleGrid[0][j] == 1 ? 0 : 1;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                //有障碍物跳过
                if(obstacleGrid[i][j] == 1){
                    continue;
                }
                //当前节点路径 = 左边节点路径数 + 上方节点路径数
                path[i][j] = path[i-1][j] + path[i][j-1];
            }
        }
        return path[m-1][n-1];
    }
}
