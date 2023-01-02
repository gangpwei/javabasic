package com.wgp.middle;

import com.wgp.middle.string.M03_LengthOfLongestSubstring;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * @author gangpeng.wgp
 * @date 2022/11/22 下午12:41
 */
public class LengthOfLongestSubstringTest extends TestCase {

    public void testLengthOfLongestSubstring() {
        M03_LengthOfLongestSubstring test = new M03_LengthOfLongestSubstring();
        Assert.assertEquals(3, test.lengthOfLongestSubstring("abcabcbb"));

        Assert.assertEquals(1, test.lengthOfLongestSubstring("bbbbb"));

        Assert.assertEquals(1, test.lengthOfLongestSubstring("b"));

        Assert.assertEquals(3, test.lengthOfLongestSubstring("pwwkew"));
    }
}