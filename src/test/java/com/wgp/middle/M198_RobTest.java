package com.wgp.middle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gangpeng.wgp
 * @date 2022/11/22 下午9:02
 */
public class M198_RobTest {

    @Test
    public void rob() {
        M198_Rob test = new M198_Rob();
        int value = test.rob(new int[]{1,2,3,1});
        assertEquals(value, 4);

        value = test.rob(new int[]{2,7,9,3,1});
        assertEquals(value, 12);

        value = test.rob(new int[]{2,1,1,2});
        assertEquals(value, 4);
    }
}