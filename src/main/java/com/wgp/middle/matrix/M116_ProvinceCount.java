package com.wgp.middle.matrix;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 剑指 Offer II 116. 省份数量
 * @author gangpeng.wgp
 * @date 2023/1/2 下午12:46
 */
public class M116_ProvinceCount {

    //有 n 个城市，其中一些彼此相连，另一些没有相连。如果城市 a 与城市 b 直接相连，且城市 b 与城市 c 直接相连，那么城市 a 与城市 c 间接相连。
    //省份 是一组直接或间接相连的城市，组内不含其他没有相连的城市。
    //给你一个 n x n 的矩阵 isConnected ，其中 isConnected[i][j] = 1 表示第 i 个城市和第 j 个城市直接相连，而 isConnected[i][j] = 0 表示二者不直接相连。
    //返回矩阵中 省份 的数量。

    public int findCircleNum(int[][] isConnected) {
        //城市数量
        int citys = isConnected.length;
        //城市是否被遍历过
        boolean[] visited = new boolean[citys];
        //省份数量
        int provinceCnt = 0;
        for (int i = 0; i < citys; i++) {
            //当前城市，没有被访问过，就是一个新的省
            if(!visited[i]){
                //与第i个城市相连的所有城市都打标，并递归的遍历间接相连的城市
                dfs(i, citys,  visited, isConnected);
                provinceCnt ++;
            }
        }
        return provinceCnt;
    }



    /**
     * 深度遍历，与第i个城市相连的所有城市都打标，并递归的遍历间接相连的城市
     * @param i
     * @param citys
     * @param visited
     * @param isConnected
     */
    private void dfs(int i, int citys, boolean[] visited, int[][] isConnected) {
        for (int j = 0; j < citys; j++) {
            if(isConnected[i][j] == 1 && !visited[j]){
                //把和citys[i]直接相连的城市，都标记已访问
                visited[j] = true;

                //把和citys[i]间接相连的城市，都标记已访问
                dfs(j, citys, visited, isConnected);
            }
        }
    }

    public int findCircleNum2(int[][] isConnected) {
        //城市数量
        int citys = isConnected.length;
        //城市是否被遍历过
        boolean[] visited = new boolean[citys];
        //省份数量
        int provinceCnt = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < citys; i++) {
            if(visited[i]){
                continue;
            }

            queue.offer(i);
            while (!queue.isEmpty()){
                int x = queue.poll();
                for (int j = 0; j < citys; j++) {
                    if(isConnected[x][j] == 1 && !visited[j]){
                        visited[j] = true;
                        queue.offer(j);
                    }
                }
            }
            provinceCnt ++;
        }
        return provinceCnt;
    }


    @Test
    public void testCase() {

        assertEquals(2, findCircleNum2(new int[][]{{1,1,0},{1,1,0},{0,0,1}}));

        assertEquals(3, findCircleNum2(new int[][]{{1,0,0},{0,1,0},{0,0,1}}));
    }
}
