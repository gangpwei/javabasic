package com.wgp.middle;

import java.util.Arrays;

/**
 * 最接近的三数之和
 * @author gangpeng.wgp
 * @date 2022/11/25 上午11:40
 */
public class M16_ThreeSumClosest {

    /**
     * 排序 + 快慢指针
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int best = Integer.MAX_VALUE;
        for (int i = 0; i < n-2; i++) {
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(Math.abs(target - sum) < Math.abs((target - best))){
                    best = sum;
                }

                //大于目标，左指针右移
                if(sum > target){
                    k --;
                }else if(sum < target){
                    j ++;
                }else{
                    return target;
                }
            }
        }

        return best;

    }
}
