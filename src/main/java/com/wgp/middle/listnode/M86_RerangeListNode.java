package com.wgp.middle.listnode;

import com.wgp.easy.ListNode;

/**
 * 分隔链表
 *
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
class M86_RerangeListNode {
    //给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
    //
    //你应当 保留 两个分区中每个节点的初始相对位置。

    public ListNode partition(ListNode head, int x) {
        //弄2个链表，一个存小于X的，一个存大于等于X的。再把大于X的接到小于X的后面
        ListNode smallHead = new ListNode(0, head);
        ListNode small = smallHead;
        ListNode largeHead = new ListNode(0, head);
        ListNode large = largeHead;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val < x) {
                small.next = curr;
                small = small.next;
            } else {
                large.next = curr;
                large = large.next;
            }
            curr = curr.next;
        }
        //注意：这里要断开，否则会和小于X的节点形成环
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;

    }
}