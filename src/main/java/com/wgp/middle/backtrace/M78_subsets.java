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
public class M78_subsets {

    //����һ�������ظ����ֵ����� nums �������� ���п��ܵ�ȫ���� ������� ������˳�� ���ش𰸡�

    List<List<Integer>> res;
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        res.add(new ArrayList<>());
        backTracing(nums, 0);
        return res;
    }

    public void backTracing(int[] nums, int start){
        // ������ĩβ������ǰ�ݹ�
        if(start == nums.length){
            return;
        }

        //ע��i �Ӵ����start��ʼ����
        for(int i = start; i < nums.length; i++){
            // ����ǰ������list
            list.add(nums[i]);
            res.add(new ArrayList<>(list));
            // �ݹ� �����ظ�ʹ�õ�ǰ�� �����һ�ִ�i+1��ʼ
            backTracing(nums, i+1);
            // ���� ���˸ոռӵ���
            list.remove(list.size()-1);
        }
    }

    @Test
    public void testCase() throws Exception {
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = this.subsets(nums);
        System.out.println(result);

    }
}