package com.wgp.middle;

import com.wgp.easy.ListNode;

/**
 * 两两交换链表中的节点
 * @author gangpeng.wgp
 * @date 2022/11/25 下午1:12
 */
public class M24_SwapPairNodes {

    /**
     * 递归
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}
