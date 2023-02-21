package com.wgp.easy.array.sort;

import java.util.Arrays;

import org.junit.Test;

/**
 * 快速排序
 * @author gangpeng.wgp
 * @date 2023/1/7 下午4:31
 */
public class QuickSort {

    public void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    /**
     * 时间复杂度 O(nlogn）
     * 空间复杂度 O(1)
     * @param array
     * @param start
     * @param end
     */
    public void quickSort(int[] array, int start, int end){
        if(start >= end){
            return;
        }
        //拿第一个元素作为基准值
        int base = array[start];

        //注意，要弄2个指针分别指向头尾，不能直接用头尾在后面的运算中
        // 因为最后面递归还需要用到头尾参数
        int left = start;
        int right = end;
        while(left < right){

            //从右往左找，第一个比基准值小的值
            while (left < right && array[right] >= base){
                right --;
            }

            //从左往右找，第一个比基准值大的值
            while (left < right && array[left] <= base){
                left ++;
            }

            if(left < right){
                //交换left与right相遇
                swap(array, left, right );
            }else if(left == right){
                //交换基准值和 left与right 相遇位置的值
                swap(array, start, left );
            }
        }

        quickSort(array, start, right - 1);
        quickSort(array, right + 1, end);
    }

    /**
     * 交换2数位置
     * @param array
     * @param indexA
     * @param indexB
     */
    private void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexB];
        array[indexB] = array[indexA];
        array[indexA] = temp;
    }

    @Test
    public void testCase(){
        int[] array = new int[]{4, 3, 2, 6, 1, 10};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
