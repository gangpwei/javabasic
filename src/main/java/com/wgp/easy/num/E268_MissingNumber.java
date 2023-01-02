package com.wgp.easy.num;

import java.util.Arrays;

/**
 * ��ʧ������
 * @author : gangpeng.wgp
 * @date : 2022/12/3
 */
public class E268_MissingNumber {

    /**
     * ����һ������ [0, n] �� n ���������� nums ���ҳ� [0, n] �����Χ��û�г����������е��Ǹ�����
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;

    }
}