package com.wgp.basic;

/**
 * @author gangpeng.wgp
 * @date 2023/1/14 ����1:07
 */
public class ReturnType {

    /**
     * ��ͬ���������������㷨��
     * 1�����ȵ͵�ת��Ϊ���ȸߵ�
     * 2������ת��˳�򣺣�short, char��-> int -> long -> double <- float
     * @param x
     * @param y
     * @return
     */
    private double method(byte x, double y) {
        return (short)x / y * 2;
    }
}
