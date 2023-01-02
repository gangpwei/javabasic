package com.wgp.middle;

import com.wgp.middle.matrix.M64_MinPathSum;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gangpeng.wgp
 * @date 2022/11/25 下午5:27
 */
public class M64_MinPathSumTest {

    @Test
    public void minPathSum() {
        M64_MinPathSum test = new M64_MinPathSum();
        assertEquals(7, test.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));

        assertEquals(12, test.minPathSum(new int[][]{{1,2,3},{4,5,6}}));
    }
}