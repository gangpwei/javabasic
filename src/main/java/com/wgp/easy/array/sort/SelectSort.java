package com.wgp.easy.array.sort;

import java.util.Arrays;

import org.junit.Test;

/**
 * 选择排序
 *
 * @author gangpeng.wgp
 * @date 2023/1/7 下午4:31
 */
public class SelectSort {

    public void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i;
            int minIndex = j;
            for (; j < array.length; j++) {
                //取最小值
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                swap(array, i, minIndex);
            }
        }
    }

    /**
     * 交换2数位置
     *
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
    public void testCase() {
        int[] array = new int[] {4, 3, 2, 6, 1, 10};
        selectSort(array);
        System.out.println(Arrays.toString(array));

        array = new int[] {27, 13, 27, 29, 8, 13, 23};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
