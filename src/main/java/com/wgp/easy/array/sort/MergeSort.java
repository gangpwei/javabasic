package com.wgp.easy.array.sort;

import java.util.Arrays;

import org.junit.Test;

/**
 * �鲢����
 *
 * @author gangpeng.wgp
 * @date 2023/1/7 ����4:31
 */
public class MergeSort {

    public static void sort(int[] array) {
        int[] temp = new int[array.length];
        sort(array, 0, array.length - 1, temp);
    }

    public static void sort(int[] array, int left, int right, int[] temp) {
        if (left < right) {
            //����м�ֵ
            int mid = (left + right) / 2;

            //����߷ֽ�
            sort(array, left, mid, temp);
            //���ұ߷ֽ�
            sort(array, mid + 1, right, temp);
            //�ϲ�����
            sum(array, left, right, mid, temp);
        }
    }

    /**
     * �ϲ�2����������
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

        //ָ����ʱ�����±�
        int t = 0;

        //��ʼѭ���Ƚ�������������Ԫ�رȽ�
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

        //��ʣ���Ԫ��ֱ�Ӵ������ʱ������
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

        //��ʱ�����е�Ԫ�ؿ�����ԭ������
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
