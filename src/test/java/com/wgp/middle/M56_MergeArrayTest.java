package com.wgp.middle;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gangpeng.wgp
 * @date 2022/11/25 下午2:45
 */
public class M56_MergeArrayTest {

    @Test
    public void merge() {

        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        M56_MergeArray test = new M56_MergeArray();
        int[][] result = test.merge(intervals);

        int[][] excepted = new int[][]{{1,6},{8,10},{15,18}};

        assertTrue(Arrays.deepEquals(result, excepted));
    }
}