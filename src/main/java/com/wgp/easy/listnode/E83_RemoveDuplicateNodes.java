package com.wgp.easy.listnode;

import com.wgp.easy.ListNode;
import org.junit.Test;

/**
 * 删除排序链表中的重复元素
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
public class E83_RemoveDuplicateNodes {


    public ListNode removeDuplicateNodes(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode current = head;
        while(current.next != null){
            if(current.next.val == current.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }


    @Test
    public void testCase() throws Exception {

        int[] nums1 = {1,1,2};
        ListNode node1 = ListNode.getListNode(nums1);
        node1.printListNode();

        ListNode result =null;
        //result = new E83_RemoveDuplicateNodes().removeDuplicateNodes(node1);
        //result.printListNode();

        int[] nums2 = {1,1,2,3,3};
        result = new E83_RemoveDuplicateNodes().removeDuplicateNodes(ListNode.getListNode(nums2));
        result.printListNode();
    }
}