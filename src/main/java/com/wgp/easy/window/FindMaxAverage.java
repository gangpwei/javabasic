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
        double maxAvg = Double.NEGATIVE_INFINITY;
        int first = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + k > nums.length) {
                return maxAvg;
            }
            if (i == 0) {
                for (int j = 0; j < k; j++) {
                    sum = sum + nums[j];
                }
            } else {
                sum = sum - first + nums[i + k - 1];
            }
            first = nums[i];
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
