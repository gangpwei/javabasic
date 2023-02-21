package com.wgp.middle.matrix;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * ��ָ Offer II 116. ʡ������
 * @author gangpeng.wgp
 * @date 2023/1/2 ����12:46
 */
public class M116_ProvinceCount {

    //�� n �����У�����һЩ�˴���������һЩû��������������� a ����� b ֱ���������ҳ��� b ����� c ֱ����������ô���� a ����� c ���������
    //ʡ�� ��һ��ֱ�ӻ��������ĳ��У����ڲ�������û�������ĳ��С�
    //����һ�� n x n �ľ��� isConnected ������ isConnected[i][j] = 1 ��ʾ�� i �����к͵� j ������ֱ���������� isConnected[i][j] = 0 ��ʾ���߲�ֱ��������
    //���ؾ����� ʡ�� ��������

    public int findCircleNum(int[][] isConnected) {
        //��������
        int citys = isConnected.length;
        //�����Ƿ񱻱�����
        boolean[] visited = new boolean[citys];
        //ʡ������
        int provinceCnt = 0;
        for (int i = 0; i < citys; i++) {
            //��ǰ���У�û�б����ʹ�������һ���µ�ʡ
            if(!visited[i]){
                //���i���������������г��ж���꣬���ݹ�ı�����������ĳ���
                dfs(i, citys,  visited, isConnected);
                provinceCnt ++;
            }
        }
        return provinceCnt;
    }



    /**
     * ��ȱ��������i���������������г��ж���꣬���ݹ�ı�����������ĳ���
     * @param i
     * @param citys
     * @param visited
     * @param isConnected
     */
    private void dfs(int i, int citys, boolean[] visited, int[][] isConnected) {
        for (int j = 0; j < citys; j++) {
            if(isConnected[i][j] == 1 && !visited[j]){
                //�Ѻ�citys[i]ֱ�������ĳ��У�������ѷ���
                visited[j] = true;

                //�Ѻ�citys[i]��������ĳ��У�������ѷ���
                dfs(j, citys, visited, isConnected);
            }
        }
    }

    public int findCircleNum2(int[][] isConnected) {
        //��������
        int citys = isConnected.length;
        //�����Ƿ񱻱�����
        boolean[] visited = new boolean[citys];
        //ʡ������
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
