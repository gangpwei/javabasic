package com.wgp.easy.array;

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

        int index1 = m - 1;
        int index2 = n-1;
        if(m == 0){
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        if(n == 0){
            return;
        }

        int storeIndex = m + n - 1;
        //注意边界，>= 0
        while(storeIndex >= 0 && (index1 >= 0 || index2 >= 0)){
            if(index1 <0){
                nums1[storeIndex] = nums2[index2];
                index2 --;
            }else if(index2 <0) {
                nums1[storeIndex] = nums1[index1];
                index1 --;
            }else if(nums2[index2] >= nums1[index1]){
                nums1[storeIndex] = nums2[index2];
                index2 --;
            }else{
                nums1[storeIndex] = nums1[index1];
                index1 --;
            }
            storeIndex --;
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