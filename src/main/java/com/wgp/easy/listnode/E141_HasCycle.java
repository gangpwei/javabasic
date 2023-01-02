package com.wgp.easy.listnode;

import com.wgp.easy.ListNode;

/**
 *  ��������: �ж�һ�������Ƿ���ڻ�
 * @author gangpeng.wgp
 * @date 2022/12/1 ����10:38
 */
public class E141_HasCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        //ע���жϿ���ָ���Ƿ�Ϊ��
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
