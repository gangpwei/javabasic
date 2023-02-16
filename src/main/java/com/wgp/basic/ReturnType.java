package com.wgp.basic;

/**
 * @author gangpeng.wgp
 * @date 2023/1/14 下午1:07
 */
public class ReturnType {

    /**
     * 不同类型数据运算运算法则：
     * 1、精度低的转换为精度高的
     * 2、精度转换顺序：（short, char）-> int -> long -> double <- float
     * @param x
     * @param y
     * @return
     */
    private double method(byte x, double y) {
        return (short)x / y * 2;
    }
}
