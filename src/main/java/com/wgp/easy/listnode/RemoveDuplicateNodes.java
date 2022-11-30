package com.wgp.easy.listnode;

import java.util.HashSet;
import java.util.Set;

import easy.ListNode;
import org.junit.Test;

public class RemoveDuplicateNodes {


    public ListNode removeDuplicateNodes(ListNode head) {
        if(head == null){
            return null;
        }

        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode pos = head;
        while(pos.next != null){
            //������µ�ֵ��ָ��ָ���¸��ڵ�
            if(!set.contains(pos.next.val)){
                set.add(pos.next.val);
                pos = pos.next;
            }else{
                //������ϵ�ֵ��ָ��ָ�����¸��ڵ�
                pos.next = pos.next.next;
            }
        }
        pos.next = null;
        return head;
    }


    @Test
    public void testCase() throws Exception {

        int[] nums1 = {1, 2, 3, 3, 2, 1};
        ListNode node1 = ListNode.getListNode(nums1);
        node1.printListNode();

        ListNode result = new RemoveDuplicateNodes().removeDuplicateNodes(node1);
        result.printListNode();

        int[] nums2 = {1, 1, 1, 1, 2};
        result = new RemoveDuplicateNodes().removeDuplicateNodes(ListNode.getListNode(nums2));
        result.printListNode();
    }
}