package com.wgp.middle.matrix;

import org.junit.Assert;
import org.junit.Test;

/**
 * ������
 * ���x�е�y�б���װ�˶��پ�
 * @author gangpeng.wgp
 * @date 2023/1/2 ����5:01
 */
public class M799_champagneTower {
    public double champagneTower(int poured, int query_row, int query_glass) {
        //ÿ��λ�������ǰ��������
        double[][] capacity = new double[100][100];
        capacity[0][0] = poured;
        for (int i = 0; i < query_row; i++) {
            //ע�⣺j ������λ���� i
            for (int j = 0; j <= i ; j++) {
                //������2������ľ�
                double yichu = (capacity[i][j] - 1.0) / 2;
                if(yichu > 0){
                    //���½�
                    capacity[i + 1][j] += yichu;

                    //���½�
                    capacity[i + 1][j+1] += yichu;
                }
            }
        }
        return Math.min(1, capacity[query_row][query_glass]);
    }

    @Test
    public void testCase(){
        Assert.assertTrue(champagneTower(2, 1, 1) == 0.5d);

        Assert.assertTrue(champagneTower(100000009, 33, 17) == 1d);

        Assert.assertTrue(champagneTower(25, 6, 1) == 0.1875d);
    }

}
