package com.wgp.easy.listnode;

import com.wgp.easy.ListNode;
import org.junit.Test;

/**
 * 反转链表
 * @author : gangpeng.wgp
 * @date : 2022/12/3
 */
public class E206_ReversNodes {

    /**
     * 迭代法
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
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

        //ListNode result = new E206_ReversNodes().reverseList(node1);

        ListNode result = new E206_ReversNodes().recursion(node1);
        result.printListNode();

    }

    /**
     * 递归法
     * @param head
     * @return
     */
    public ListNode recursion(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }



}