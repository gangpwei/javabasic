package com.wgp.easy.array.sort;

import java.util.Arrays;

import org.junit.Test;

/**
 * 堆排序
 * @author : gangpeng.wgp
 * @date : 2023/2/5
 */
public class HeapSort {

    public static void sort(int[] array) {
        //把数组变成大根堆
        //这里元素的索引是从0开始的,所以最后一个非叶子结点array.length/2 - 1
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, array.length);
        }

        // 开始排序逻辑
        for (int j = array.length - 1; j > 0; j--) {
            // 元素交换,作用是去掉大顶堆
            // 把大顶堆的根元素，放到数组的最后；换句话说，就是每一次的堆调整之后，都会有一个元素到达自己的最终位置
            swap(array, 0, j);
            // 对剩下的元素重新变成堆
            adjustHeap(array, 0, j);
        }
    }

    /**
     * 把数组变成大根堆
     *
     * @param array  待组堆
     * @param i      起始结点
     * @param length 堆的长度
     */
    public static void adjustHeap(int[] array, int i, int length) {
        // 根节点
        int temp = array[i];
        //2*i+1为左子树i的左子树(因为i是从0开始的),2*k+1为k的左子树
        for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
            // 让k先指向子节点中最大的节点
            //如果有右子树,并且右子树大于左子树
            if (k + 1 < length && array[k] < array[k + 1]) {
                k++;
            }
            //如果发现结点(左右子结点)大于根结点，则进行值的交换
            if (array[k] > temp) {
                swap(array, i, k);
                // 如果子节点更换了，那么，以子节点为根的子树会受到影响,所以，循环对子节点所在的树继续进行判断
                i = k;
            } else {  //不用交换，直接终止循环
                break;
            }
        }
    }

    /**
     * 交换元素
     *
     * @param arr
     * @param a   元素的下标
     * @param b   元素的下标
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