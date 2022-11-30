package com.wgp.easy;

import java.util.Arrays;

import org.junit.Test;

/**
 * 合并有序数组
 * 尾部扫描取最大值，放入原数组
 * 从2个数组总长度开始遍历
 * @author weigangpeng
 * @date 2018/01/21 上午11:24
 */

public class E88_MergeTwoArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int nums1Index = m - 1;
        int nums2Index = n-1;
        if(m == 0){
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        if(n == 0){
            return;
        }
        for(int storeIndex = m + n -1; storeIndex >=0 && ( nums1Index >=0 || nums2Index >=0); storeIndex --){
            if(nums1Index <0){
                nums1[storeIndex] = nums2[nums2Index];
                nums2Index --;
            }else if(nums2Index <0) {
                nums1[storeIndex] = nums1[nums1Index];
                nums1Index --;
            }else if(nums2[nums2Index] >= nums1[nums1Index]){
                nums1[storeIndex] = nums2[nums2Index];
                nums2Index --;
            }else{
                nums1[storeIndex] = nums1[nums1Index];
                nums1Index --;
            }
        }
    }
    

    @Test
    public void jia() throws Exception {
        int[] nums1;
        nums1 = new int[]{1,2,3,0,0,0};
        merge(nums1, 3, new int[]{2,5,6}, 3);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{1};
        merge(nums1, 1, new int[]{}, 0);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{0};
        merge(nums1, 0, new int[]{1}, 1);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{2,0};
        merge(nums1, 1, new int[]{1}, 1);
        System.out.println(Arrays.toString(nums1));
    }


}