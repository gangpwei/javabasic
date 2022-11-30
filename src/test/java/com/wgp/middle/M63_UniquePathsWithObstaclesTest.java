package com.wgp.middle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author gangpeng.wgp
 * @date 2022/11/25 下午4:20
 */
public class M63_UniquePathsWithObstaclesTest {

    @Test
    public void uniquePaths() {
        M63_UniquePathsWithObstacles test = new M63_UniquePathsWithObstacles();
        //assertEquals(2, test.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));

        assertEquals(0, test.uniquePathsWithObstacles(new int[][]{{1,0}}));
    }
}