package com.wgp.middle.backtrace;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * ȫ����
 *
 * @author : gangpeng.wgp
 * @date : 2022/12/5
 */
public class M46_permute {

    //����һ�������ظ����ֵ����� nums �������� ���п��ܵ�ȫ���� ������� ������˳�� ���ش𰸡�

    private List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<Integer> path = new ArrayList<>(n);
        boolean[] used = new boolean[n];
        int depth = 0;
        backtrace(path, used, depth, nums);
        return lists;
    }

    public void backtrace(List<Integer> list, boolean[] used, int depth, int[] nums) {
        if (depth == nums.length) {
            lists.add(new ArrayList(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                list.add(nums[i]);
                used[i] = true;
                backtrace(list, used, depth + 1, nums);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }

    @Test
    public void testCase() throws Exception {
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = this.permute(nums);
        System.out.println(result);

    }
}