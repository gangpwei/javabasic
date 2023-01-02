package com.wgp.easy.num;

import org.junit.Assert;
import org.junit.Test;

/**
 * 硬币排列
 * 第N行排N个硬币，最多可以排多少行
 *
 * @author gangpeng.wgp
 * @date 2023/1/1 下午4:23
 */
public class ArrangeCoin {

    /**
     * 二分查找
     *
     * @param n
     * @return
     */
    public int arrangeCoin(int n) {
        int l = 0, r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            //耗费硬币总数 = 1 + 2 + 3 + ... x = (x平方 + x) / 2
            int cost = (mid * mid + mid) / 2;
            if (cost == n) {
                return mid;
            } else if (cost > n) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    @Test
    public void testCase() {
        Assert.assertEquals(arrangeCoin(10), 4);
        Assert.assertEquals(arrangeCoin(11), 4);
    }
}
