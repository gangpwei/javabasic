package com.wgp.middle.num;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
class M57_InsertRange {

    //����һ�� ���ص��� ������������ʼ�˵�����������б�
    //
    //���б��в���һ���µ����䣬����Ҫȷ���б��е�������Ȼ�����Ҳ��ص�������б�Ҫ�Ļ������Ժϲ����䣩��

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0];
        int right = newInterval[1];
        boolean placed = false;
        List<int[]> ansList = new ArrayList<int[]>();
        for (int[] interval : intervals) {
            if (interval[0] > right) {
                // �ڲ���������Ҳ����޽���
                if (!placed) {
                    ansList.add(new int[]{left, right});
                    placed = true;                    
                }
                ansList.add(interval);
            } else if (interval[1] < left) {
                // �ڲ��������������޽���
                ansList.add(interval);
            } else {
                // ����������н������������ǵĲ���
                left = Math.min(left, interval[0]);
                right = Math.max(right, interval[1]);
            }
        }
        if (!placed) {
            ansList.add(new int[]{left, right});
        }
        int[][] ans = new int[ansList.size()][2];
        for (int i = 0; i < ansList.size(); ++i) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }
}