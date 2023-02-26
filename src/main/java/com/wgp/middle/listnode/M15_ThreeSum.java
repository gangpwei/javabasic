package com.wgp.middle.listnode;

import com.wgp.easy.ListNode;
import org.junit.Test;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class M15_ThreeSum {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummpy = new ListNode(0, head);
        ListNode pre = dummpy;
        for(int i =0; i< left -1; i++){
            pre = pre.next;
        }

        //起始节点
        ListNode leftNode = pre.next;
        ListNode current = pre;

        for(int i =0; i< right - left + 1; i++){
            current = current.next;
        }
        //右节点
        ListNode rightNode = current;

        ListNode endNode = rightNode.next;

        pre.next = null;
        rightNode.next = null;

        ListNode node = reverseListNode(leftNode);

        pre.next = node;
        leftNode.next = endNode;

        return dummpy.next;

    }

    public ListNode reverseListNode(ListNode head) {

        ListNode pre = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

    @Test
    public void testCase() throws Exception {

        int[] nums1 = {1, 2, 3, 4, 5};
        ListNode node1 = ListNode.getListNode(nums1);
        node1.printListNode();

        ListNode result = this.reverseBetween(node1, 2, 4);
        result.printListNode();

    }
}