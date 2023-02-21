package com.wgp.easy.array.sort;

import java.util.Arrays;

import org.junit.Test;

/**
 * 归并排序
 *
 * @author gangpeng.wgp
 * @date 2023/1/7 下午4:31
 */
public class MergeSort {

    public static void sort(int[] array) {
        int[] temp = new int[array.length];
        sort(array, 0, array.length - 1, temp);
    }

    public static void sort(int[] array, int left, int right, int[] temp) {
        if (left < right) {
            //求出中间值
            int mid = (left + right) / 2;

            //向左边分解
            sort(array, left, mid, temp);
            //向右边分解
            sort(array, mid + 1, right, temp);
            //合并数据
            sum(array, left, right, mid, temp);
        }
    }

    /**
     * 合并2个有序数组
     *
     * @param array
     * @param left
     * @param right
     * @param mid
     * @param temp
     */
    public static void sum(int[] array, int left, int right, int mid, int[] temp) {
        int i = left;
        int j = mid + 1;

        //指向临时数组下标
        int t = 0;

        //开始循环比较左右两遍数组元素比较
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[t] = array[i];
                t++;
                i++;
            } else {
                temp[t] = array[j];
                t++;
                j++;
            }
        }

        //把剩余的元素直接存放在临时数组中
        while (i <= mid) {
            temp[t] = array[i];
            t++;
            i++;
        }
        while (j <= right) {
            temp[t] = array[j];
            t++;
            j++;
        }

        //临时数组中的元素拷贝至原数组中
        int tempIndex = left;
        int k = 0;
        while (tempIndex <= right) {
            array[tempIndex] = temp[k];
            k++;
            tempIndex++;
        }
    }

    @Test
    public void testCase() {
        int[] array = new int[] {4, 3, 2, 6, 1, 10};
        sort(array);
        System.out.println(Arrays.toString(array));

        array = new int[] {27, 13, 27, 29, 8, 13, 23};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
