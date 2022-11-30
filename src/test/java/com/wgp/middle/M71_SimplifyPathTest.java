package com.wgp.middle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gangpeng.wgp
 * @date 2022/11/25 下午6:46
 */
public class M71_SimplifyPathTest {

    @Test
    public void simplifyPath() {
        M71_SimplifyPath test = new M71_SimplifyPath();
        assertEquals(test.simplifyPath("/home//foo/"), "/home/foo");

        assertEquals(test.simplifyPath("/a/./b/../../c/"), "/c");
    }
}