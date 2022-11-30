package com.wgp.middle;

import com.wgp.easy.ListNode;

/**
 * 旋转链表
 * @author gangpeng.wgp
 * @date 2022/11/25 下午3:16
 */
public class M61_RotateRight {

    //给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。

    /**
     * 闭合为环
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        //链表长度
        int n = 1;
        ListNode x = head;
        while (x.next != null){
            n++;
            x = x.next;
        }

        //头尾相连，形成环
        x.next = head;

        //链表移动n次，会还原；
        //注意：移动y次，链表的头节点是 n - y，而不是 y
        int add = n - k % n;

        while(add -- > 0){
            x = x.next;
        }
        ListNode result = x.next;
        //断环
        x.next = null;
        return result;
    }
}
