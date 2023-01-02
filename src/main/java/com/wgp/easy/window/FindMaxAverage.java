package com.wgp.easy.window;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author gangpeng.wgp
 * @date 2022/11/9 3:25 ����
 */
public class FindMaxAverage {

    //����һ���� n ��Ԫ����ɵ��������� nums ��һ������ k ��
    //
    //�����ҳ�ƽ��������� ����Ϊ k �����������飬����������ƽ������
    //
    //�κ����С�� 10-5 �Ĵ𰸶�������Ϊ��ȷ�𰸡�
    //
    //
    //ʾ�� 1��
    //
    //���룺nums = [1,12,-5,-6,50,3], k = 4
    //�����12.75
    //���ͣ����ƽ���� (12-5-6+50)/4 = 51/4 = 12.75
    //ʾ�� 2��
    //
    //���룺nums = [5], k = 1
    //�����5.00000


    public double findMaxAverage(int[] nums, int k) {
        //ע�⣬��ʼֵΪ������
        double maxAvg = Double.NEGATIVE_INFINITY;
        int sum = 0;

        //ͳ�Ƶ�һ�����ڵĺ�
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        int first = nums[0];
        maxAvg = (double)sum / k;

        for (int i = 1; i < nums.length; i++) {
            //ע�⣺����Խ��
            if (i + k > nums.length) {
                return maxAvg;
            }
            sum = sum - first + nums[i + k - 1];

            first = nums[i];
            //ע�⣺2��int���Ҫתdouble
            double avg = (double)sum / k;
            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg;
    }

    @Test
    public void runTest() throws Exception {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result =0;

        result= findMaxAverage(nums, k);
        Assert.assertTrue(result == 12.75000);

        nums = new int[] {5};
        k = 1;
        result = findMaxAverage(nums, k);
        Assert.assertTrue(result == 5);

        nums = new int[] {-1};
        k = 1;
        result = findMaxAverage(nums, k);
        Assert.assertTrue(result == -1);

    }
}
