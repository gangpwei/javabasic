package com.wgp.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 2��֮�͵���Ŀ��ֵ
 * Map �棺��ǰֵ �� ������
 * @author weigangpeng
 * @date 2018/01/21 ����11:24
 */

public class E01_twoSum {

    /**
     * 2��֮�ͣ���ϣ��
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum0(int[] nums, int target) {
        //key: ����ֵ��value: �����е��±�
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int otherValue = target - nums[i];
            if(map.containsKey(otherValue)){
                return new int[]{map.get(otherValue), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }



    @Test
    public void jia() throws Exception {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = new E01_twoSum().twoSum0(nums, target);
        System.out.println(Arrays.toString(result));

        nums = new int[]{3,2,4};
        target = 6;

        result = new E01_twoSum().twoSum0(nums, target);
        System.out.println(Arrays.toString(result));
    }


}