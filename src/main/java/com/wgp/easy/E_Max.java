package com.wgp.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * 求两数最大值
 */

public class E_Max {

    /**
     * 两数差值，加上2数，取平均值
     *
     * @return
     */
    public int maximum(int a, int b) {
        long c = a, d = b;
        return (int)((Math.abs(c - d) + c + d) / 2);
    }

    @Test
    public void testCase() throws Exception {
        int result = maximum(2, 3);
        assertTrue(result == 3);

    }

}