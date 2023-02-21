package com.wgp.easy.array.sort;

import java.util.Arrays;

import org.junit.Test;

/**
 * 插入排序
 *
 * @author gangpeng.wgp
 * @date 2023/1/7 下午4:31
 */
public class InsertSort {

    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            //基准位的值
            int tmp = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                //当前值大于基准位, 向后移动一位
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }

    @Test
    public void testCase() {
        int[] array = new int[] {4, 3, 2, 6, 1, 10};
        insertionSort(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{27, 13, 27, 29, 8, 13, 23};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
