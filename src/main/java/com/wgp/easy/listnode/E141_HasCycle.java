package com.wgp.easy.listnode;

import com.wgp.easy.ListNode;

/**
 *  环形链表: 判断一个链表是否存在环
 * @author gangpeng.wgp
 * @date 2022/12/1 下午10:38
 */
public class E141_HasCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        //注意判断快慢指针是否为空
        while (slow != null && fast != null && fast.next != null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
