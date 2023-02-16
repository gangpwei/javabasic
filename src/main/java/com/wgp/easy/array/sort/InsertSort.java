package com.wgp.easy.array.sort;

import java.util.Arrays;

import org.junit.Test;

/**
 * ��������
 *
 * @author gangpeng.wgp
 * @date 2023/1/7 ����4:31
 */
public class InsertSort {

    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            //��׼λ��ֵ
            int tmp = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                //��ǰֵ���ڻ�׼λ, ����ƶ�һλ
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
