package com.wgp.easy.array.sort;

import java.util.Arrays;

import org.junit.Test;

/**
 * ��������
 * @author gangpeng.wgp
 * @date 2023/1/7 ����4:31
 */
public class QuickSort {

    public void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    /**
     * ʱ�临�Ӷ� O(nlogn��
     * �ռ临�Ӷ� O(1)
     * @param array
     * @param start
     * @param end
     */
    public void quickSort(int[] array, int start, int end){
        if(start >= end){
            return;
        }
        //�õ�һ��Ԫ����Ϊ��׼ֵ
        int base = array[start];

        //ע�⣬ҪŪ2��ָ��ֱ�ָ��ͷβ������ֱ����ͷβ�ں����������
        // ��Ϊ�����ݹ黹��Ҫ�õ�ͷβ����
        int left = start;
        int right = end;
        while(left < right){

            //���������ң���һ���Ȼ�׼ֵС��ֵ
            while (left < right && array[right] >= base){
                right --;
            }

            //���������ң���һ���Ȼ�׼ֵ���ֵ
            while (left < right && array[left] <= base){
                left ++;
            }

            if(left < right){
                //����left��right����
                swap(array, left, right );
            }else if(left == right){
                //������׼ֵ�� left��right ����λ�õ�ֵ
                swap(array, start, left );
            }
        }

        quickSort(array, start, right - 1);
        quickSort(array, right + 1, end);
    }

    /**
     * ����2��λ��
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
