package com.wgp.easy.listnode;

import com.wgp.easy.ListNode;
import org.junit.Test;

public class E203_RemoveElements {


    public ListNode removeElements(ListNode head, int val) {
        ListNode dump = new ListNode(-1, head);
        ListNode temp = dump;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return dump.next;
    }



    @Test
    public void testCase() throws Exception {

        int[] nums1 = {1,2,6,3,4,5,6};
        ListNode node1 = ListNode.getListNode(nums1);
        node1.printListNode();

        ListNode result = new E203_RemoveElements().removeElements(node1, 6);
        result.printListNode();

    }
}