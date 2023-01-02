package com.wgp.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;

/**
 * 01.02. 判定是否互为字符重排
 * @author gangpeng.wgp
 * @date 2022/6/29 10:16 PM
 */
public class CheckPermutation {

    public boolean checkPermutation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        //背景知识：小写字母转数字，char 的值 减 'a' 可得到 0 ~ 25的数字
        //对应字母位置出现次数加一
        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a'] += 1;
            arr2[s2.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testCase() throws Exception {
        assertFalse(new CheckPermutation().checkPermutation("cuhv", "cuvs"));
    }
}
