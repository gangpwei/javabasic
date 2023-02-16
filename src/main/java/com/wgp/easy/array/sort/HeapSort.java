package com.wgp.easy.array.sort;

import java.util.Arrays;

import org.junit.Test;

/**
 * ������
 * @author : gangpeng.wgp
 * @date : 2023/2/5
 */
public class HeapSort {

    public static void sort(int[] array) {
        //�������ɴ����
        //����Ԫ�ص������Ǵ�0��ʼ��,�������һ����Ҷ�ӽ��array.length/2 - 1
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, array.length);
        }

        // ��ʼ�����߼�
        for (int j = array.length - 1; j > 0; j--) {
            // Ԫ�ؽ���,������ȥ���󶥶�
            // �Ѵ󶥶ѵĸ�Ԫ�أ��ŵ��������󣻻��仰˵������ÿһ�εĶѵ���֮�󣬶�����һ��Ԫ�ص����Լ�������λ��
            swap(array, 0, j);
            // ��ʣ�µ�Ԫ�����±�ɶ�
            adjustHeap(array, 0, j);
        }
    }

    /**
     * �������ɴ����
     *
     * @param array  �����
     * @param i      ��ʼ���
     * @param length �ѵĳ���
     */
    public static void adjustHeap(int[] array, int i, int length) {
        // ���ڵ�
        int temp = array[i];
        //2*i+1Ϊ������i��������(��Ϊi�Ǵ�0��ʼ��),2*k+1Ϊk��������
        for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
            // ��k��ָ���ӽڵ������Ľڵ�
            //�����������,��������������������
            if (k + 1 < length && array[k] < array[k + 1]) {
                k++;
            }
            //������ֽ��(�����ӽ��)���ڸ���㣬�����ֵ�Ľ���
            if (array[k] > temp) {
                swap(array, i, k);
                // ����ӽڵ�����ˣ���ô�����ӽڵ�Ϊ�����������ܵ�Ӱ��,���ԣ�ѭ�����ӽڵ����ڵ������������ж�
                i = k;
            } else {  //���ý�����ֱ����ֹѭ��
                break;
            }
        }
    }

    /**
     * ����Ԫ��
     *
     * @param arr
     * @param a   Ԫ�ص��±�
     * @param b   Ԫ�ص��±�
     */
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
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