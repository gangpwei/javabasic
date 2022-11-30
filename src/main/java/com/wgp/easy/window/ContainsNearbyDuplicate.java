package com.wgp.easy.window;

import java.util.HashSet;
import java.util.Set;

public class ContainsNearbyDuplicate {

    //����һ����������?nums ��һ������?k ���ж��������Ƿ�������� ��ͬ������?i?��?j ������ nums[i] == nums[j] �� abs(i - j) <= k ��������ڣ����� true �����򣬷��� false ��
    //
    //
    //ʾ��?1��
    //
    //���룺nums = [1,2,3,1], k = 3
    //�����true

    /**
     * �������� + HashSet
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //����ÿ�λ������ڳ��ֵ�Ԫ��
        Set<Integer> set = new HashSet<Integer>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            //ÿ�λ����������ƣ��Ƴ���һ�����ڵĵ�һ��Ԫ��
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            //Ԫ���ظ�
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}

