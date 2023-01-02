package com.wgp.middle.listnode;

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
        //当前段的下一个节点，等于下一段反转后的结果
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}
