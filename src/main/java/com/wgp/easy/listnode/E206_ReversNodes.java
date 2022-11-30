package com.wgp.easy.listnode;

import easy.ListNode;
import org.junit.Test;

public class E206_ReversNodes {


    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while(head != null ){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }



    @Test
    public void testCase() throws Exception {

        int[] nums1 = {1, 2, 3, 4, 5};
        ListNode node1 = ListNode.getListNode(nums1);
        node1.printListNode();

        ListNode result = new E206_ReversNodes().reverseList(node1);
        result.printListNode();

    }
}