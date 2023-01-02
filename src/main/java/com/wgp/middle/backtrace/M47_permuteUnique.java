package com.wgp.middle.backtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * ȫ����
 *
 * @author : gangpeng.wgp
 * @date : 2022/12/5
 */
public class M47_permuteUnique {

    //����һ�������ظ����ֵ����� nums �������� ���п��ܵ�ȫ���� ������� ������˳�� ���ش𰸡�

    private List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        List<Integer> path = new ArrayList<>(n);
        boolean[] used = new boolean[n];
        int depth = 0;
        Arrays.sort(nums);
        backtrace(path, used, depth, nums);
        return lists;
    }

    public void backtrace(List<Integer> list, boolean[] used, int depth, int[] nums) {
        if (depth == nums.length) {
            lists.add(new ArrayList(list));
            return;
        }
        for (int i = 0; i < used.length; i++) {
            //�����жϵ�ǰֵ��ǰһ��ֵ�Ƿ���ͬ�������ж�����ظ���Ԫ���Ƿ�ʹ�ù�
            if(used[i] ||(i > 0 && nums[i] == nums[i-1] && used[i - 1])){
                continue;
            }
            list.add(nums[i]);
            used[i] = true;
            backtrace(list, used, depth + 1, nums);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }

    @Test
    public void testCase() throws Exception {
        int[] nums = {1, 1, 2, 3};

        List<List<Integer>> result = this.permuteUnique(nums);
        System.out.println(result);

    }
}