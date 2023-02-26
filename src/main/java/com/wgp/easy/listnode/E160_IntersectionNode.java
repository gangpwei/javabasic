package com.wgp.easy.listnode;

import com.wgp.easy.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 求2个相交链表的相交的起始位置
 *
 * @author : gangpeng.wgp
 * @date : 2022/11/30
 */
public class E160_IntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

    @Test
    public void testCase() throws Exception {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        ListNode node5 = new ListNode(5);
        node5.next = node2;

        assertEquals(getIntersectionNode(node1, node5).val, 2);
    }
}