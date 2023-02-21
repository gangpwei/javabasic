package com.wgp.middle.string;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 最长无重复字符串
 * @author gangpeng.wgp
 * @date 2022/11/22 下午12:39
 */
public class M03_LengthOfLongestSubstring {

    /**
     * 滑动窗口
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        // 右指针，初始值为0，相当于我们在字符串的左边界，还没有开始移动
        int rk = 0, max = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk < n && !occ.contains(s.charAt(rk))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            max = Math.max(max, rk - i);
        }
        return max;
    }


    public int getSubStr(String str) {
        if (StringUtils.isBlank(str)) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, max = 0;
        while(right < str.length()){
            Character c = str.charAt(right);
            while(set.contains(c)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(c);
            right ++;
            max = Math.max(max, right - left);
        }
        return max;
    }

    @Test
    public void testCase() throws Exception {
        assertEquals(getSubStr("abccd"), 3);
        assertEquals(getSubStr("abcabddd"), 4);
        assertEquals(getSubStr("aa"), 1);
    }
}
