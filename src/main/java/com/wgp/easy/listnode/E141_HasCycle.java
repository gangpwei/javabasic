package com.wgp.easy.listnode;

import com.wgp.easy.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

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

    @Test
    public void testCase() throws Exception {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        assertTrue(hasCycle(node1));
    }
}
