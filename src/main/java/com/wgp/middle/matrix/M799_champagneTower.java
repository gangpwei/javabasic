package com.wgp.middle.matrix;

import org.junit.Assert;
import org.junit.Test;

/**
 * 香槟塔
 * 求第x行第y列杯子装了多少酒
 * @author gangpeng.wgp
 * @date 2023/1/2 下午5:01
 */
public class M799_champagneTower {
    public double champagneTower(int poured, int query_row, int query_glass) {
        //每个位置在溢出前的总容量
        double[][] capacity = new double[100][100];
        capacity[0][0] = poured;
        for (int i = 0; i < query_row; i++) {
            //注意：j 结束的位置是 i
            for (int j = 0; j <= i ; j++) {
                //给下面2杯溢出的酒
                double yichu = (capacity[i][j] - 1.0) / 2;
                if(yichu > 0){
                    //左下角
                    capacity[i + 1][j] += yichu;

                    //右下角
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
