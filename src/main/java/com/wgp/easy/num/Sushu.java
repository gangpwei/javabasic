package com.wgp.easy.num;

import org.junit.Assert;
import org.junit.Test;

/**
 * 判断给定范围内有多少个素数
 * @author gangpeng.wgp
 * @date 2023/1/1 下午12:01
 */
public class Sushu {

    public int suShuCount(int x){
        int cnt = 0;
        boolean[] isHeShu = new boolean[x];
        for (int i = 2; i < x; i++) {
            if(!isHeShu[i]){
                cnt ++;
                //j从 i*i 开始遍历，小于 i*i的在之前的循环中以及遍历国
                for (int j = i * i; j < x; j += i) {
                    System.out.println(j);
                    isHeShu[j] = true;
                }
            }
        }
        return cnt;
    }

    @Test
    public void testCase(){
        Assert.assertEquals(suShuCount(100), 25);
    }
}
