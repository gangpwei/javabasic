package com.wgp.easy.wei;

/**
 * 位1的个数
 * @author : gangpeng.wgp
 * @date : 2022/12/3
 */
public class Solution {
    //编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            //1 << i 让第 i 位等于1，其他位等于0
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }

}