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
     * 递归法
     *
     * @param head
     * @return
     */
    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        //1、递归反转下一个节点
        ListNode partNode = reverse(head.next);

        //2、下下一个节点的下一个节点指向当前节点
        head.next.next = head;

        //3、当前节点的下一个节点置空
        head.next = null;
        return partNode;
    }

    /**
     * 迭代法
     *
     * 1、定义上一个节点
     * 2、遍历链表，当前节点的下一个节点指向上一个节点
     * 3、当前节点和上一个节点同时后移
     * @param head
     * @return
     */
    public ListNode reverse2(ListNode head) {
        //注意：这里不能用哑节点
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            //注意：上一个指针和当前指针同时后移
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

        ListNode result = new E206_ReversNodes().reverse(node1);
        result.printListNode();

        node1 = ListNode.getListNode(nums1);
        node1.printListNode();

        result = new E206_ReversNodes().reverse2(node1);
        result.printListNode();

    }



}