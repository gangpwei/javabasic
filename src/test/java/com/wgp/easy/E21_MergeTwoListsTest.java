package com.wgp.easy;

import org.junit.Test;

/**
 * @author gangpeng.wgp
 * @date 2022/11/22 下午6:06
 */
public class E21_MergeTwoListsTest {

    @Test
    public void mergeTwoLists() {
        ListNode result = null;

        E21_MergeTwoLists test = new E21_MergeTwoLists();
        result = test.mergeTwoLists(ListNode.getListNode(new int[]{1, 4, 5, 7}), ListNode.getListNode(new int[]{ 2, 3, 6}));
        result.printListNode();
    }
}