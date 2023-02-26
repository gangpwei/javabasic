package com.wgp.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 最长公共前缀
 * @author gangpeng.wgp
 * @date 2021/6/16 10:07 PM
 */
public class E14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        //以数组第一个元素字符串长度为第一个循环
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            //第一个字符串的一个字符和其他字符串的字符进行比较
            for (int j = 1; j < count; j++) {
                //字符串越界或者字符不相等，结束
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    //字符串截取，不包含第i个位置的元素
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }


    @Test
    public void runTest() throws Exception {
        String result = null;

        result = longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        Assert.assertTrue(result.equals("fl"));

        result = longestCommonPrefix(new String[]{"dog","racecar","car"});
        Assert.assertTrue(result.equals(""));

        result = longestCommonPrefix(new String[]{"flower", "flow", "flowab"});
        Assert.assertTrue(result.equals("flow"));
    }
}
