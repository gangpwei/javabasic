package com.wgp.easy.wei;

/**
 * λ1�ĸ���
 * @author : gangpeng.wgp
 * @date : 2022/12/3
 */
public class Solution {
    //��дһ��������������һ���޷����������Զ����ƴ�����ʽ��������������Ʊ��ʽ������λ��Ϊ '1' �ĸ�����Ҳ����Ϊ������������
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            //1 << i �õ� i λ����1������λ����0
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }

}