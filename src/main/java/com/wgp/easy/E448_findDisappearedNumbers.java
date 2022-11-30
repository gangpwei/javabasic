package com.wgp.easy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * �ҵ�������������ʧ������
 * β��ɨ��ȡ���ֵ������ԭ����
 * ��2�������ܳ��ȿ�ʼ����
 *
 * @author weigangpeng
 * @date 2018/01/21 ����11:24
 */

//����һ���� n ������������ nums ������ nums[i] ������ [1, n] �ڡ������ҳ������� [1, n] ��Χ�ڵ�û�г����� nums �е���
//�֣������������ʽ���ؽ����

public class E448_findDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        //����һ�������飬�ѳ��ֹ������ֶ�Ӧλ�õ�ֵ����Ϊ1
        int[] array = new int[nums.length];
        for (int n : nums) {
            array[n - 1] = 1;
        }

        //�������飬��ֵ������1�ĵط����뷵�ؽ����
        List<Integer> result = new ArrayList<Integer>();
        for (int n = 0; n < nums.length; n++) {
            if (array[n] < 1) {
                result.add(n + 1);
            }
        }
        return result;
    }

    @Test
    public void testCase() throws Exception {
        int[] nums1;
        nums1 = new int[] {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findDisappearedNumbers(nums1);
        System.out.println(result);

    }

}
