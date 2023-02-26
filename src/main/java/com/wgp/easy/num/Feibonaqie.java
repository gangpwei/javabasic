package com.wgp.easy.num;

import org.junit.Assert;
import org.junit.Test;

/**
 * 求斐波那契数列的第N位
 * @author gangpeng.wgp
 * @date 2023/1/1 下午4:23
 */
public class Feibonaqie {

    public int feibo(int n){
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }

    @Test
    public void testCase(){
        Assert.assertEquals(feibo(7), 8);
    }
}
