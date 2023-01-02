package com.wgp.middle;

import com.wgp.easy.ListNode;
import com.wgp.middle.listnode.M19_RemoveNthFromEnd;
import org.junit.Test;

/**
 * @author gangpeng.wgp
 * @date 2022/11/22 下午5:41
 */
public class M19_RemoveNthFromEndTest {

    @Test
    public void removeNthFromEnd() {
        ListNode result = null;

        M19_RemoveNthFromEnd test = new M19_RemoveNthFromEnd();
        result = test.removeNthFromEnd(ListNode.getListNode(new int[]{1, 2, 3, 4, 5, 6}), 2);
        result.printListNode();
    }
}