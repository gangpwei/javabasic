package com.wgp.middle;

import com.wgp.middle.matrix.M62_UniquePaths;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gangpeng.wgp
 * @date 2022/11/25 下午4:20
 */
public class M62_UniquePathsTest {

    @Test
    public void uniquePaths() {
        M62_UniquePaths test = new M62_UniquePaths();
        assertEquals(3, test.uniquePaths(3, 2));

        assertEquals(28, test.uniquePaths(3, 7));
    }
}