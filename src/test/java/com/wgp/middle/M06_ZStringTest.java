package com.wgp.middle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gangpeng.wgp
 * @date 2022/11/25 上午10:53
 */
public class M06_ZStringTest {

    @Test
    public void convert() {
        M06_ZString test = new M06_ZString();
        assertEquals(test.convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");

    }
}