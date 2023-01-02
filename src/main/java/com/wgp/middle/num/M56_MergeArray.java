package com.wgp.middle.num;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 合并区间
 * @author gangpeng.wgp
 * @date 2022/11/25 下午2:24
 */
public class M56_MergeArray {

    //以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
    //示例 1：
    //
    //输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
    //输出：[[1,6],[8,10],[15,18]]
    //解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].

    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return new int[0][2];
        }
        //按左端点排序
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);

        List<int[]> mergedList = new ArrayList<>();
        //遍历所有区间
        //先比较左区间和上次存的右区间，比上次大，新建一个区间
        //左区间没有更大，比较右端点，取上次和当前区间的右端点最大值
        for (int i = 0; i < intervals.length; i++) {
            int[] array = intervals[i];
            int left = array[0];
            int right = array[1];
            if(i == 0 || mergedList.get(mergedList.size() - 1)[1] < left){
                mergedList.add(new int[]{left,right});
            }else{
                mergedList.get(mergedList.size() - 1)[1] = Math.max(mergedList.get(mergedList.size() - 1)[1], right);
            }
        }
        return mergedList.toArray(new int[mergedList.size()][2]);

    }

}
