package com.wgp.middle.listnode;

import com.wgp.easy.ListNode;

/**
 * 删除链表的倒数第N个节点
 *
 * @author gangpeng.wgp
 * @date 2022/11/22 下午5:24
 */
public class M19_RemoveNthFromEnd {

    /**
     * 快慢指针
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);

        //快指针比慢指针快1位
        ListNode first = head;
        ListNode second = dummy;

        //快指针移动N位，此时快指针比慢指针快N+1位
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }

        //快慢指针同时移动，直到快指针到达队列尾部
        //此时，快指针位置=链表X+1，
        //慢指针指向的位置，X+1 - (N +1) = X- N
        //要删除的节点倒数第N位，即X- N + 1, 是慢指针的后一位
        //把慢指针的下一个节点指向他的下下个节点即可
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

}
