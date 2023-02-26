package com.wgp.easy.num;

import org.junit.Assert;
import org.junit.Test;

/**
 * x 的平方根
 * @author gangpeng.wgp
 * @date 2023/1/1 下午1:22
 */
public class E69_sqrt {

    /**
     * 二分法
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        int index= -1, l = 0, r = x;
        while (l <= r){
            int mid = l + (r - l) / 2;
            if(mid * mid <= x){
                index = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return index;
    }

    @Test
    public void testCase(){
        Assert.assertEquals(mySqrt(24), 4);

        Assert.assertEquals(mySqrt(25), 5);
    }
}
