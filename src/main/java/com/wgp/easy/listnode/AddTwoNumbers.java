package com.wgp.easy.listnode;

import easy.ListNode;
import org.junit.Test;

class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firtNode = new ListNode();
        ListNode lastnode = null;
        int add = 0;
        int level = 0;
        while (l1 != null || l2 != null || add >0){
            ListNode node = new ListNode();
            if(level == 0){
                firtNode = node;
            }
            level ++;
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + add;
            node.val = sum % 10;

            if(lastnode != null){
                lastnode.next = node;
            }


            if(sum >= 10){
                add = 1;
            }else{
                add = 0;
            }
            lastnode = node;
            if(l1 != null){
                l1 = l1.next;
            }else{
                l1 = null;
            }

            if(l2 != null){
                l2 = l2.next;
            }else{
                l2 = null;
            }

        }
        return firtNode;
    }

    @Test
    public void testCase() throws Exception {

        int[] nums1 = {9,9,9,9,9,9,9};
        ListNode node1 = ListNode.getListNode(nums1);
        node1.printListNode();

        int[] nums2 = {9,9,9,9};
        ListNode node2 = ListNode.getListNode(nums2);
        node2.printListNode();

        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(node1, node2);
        result.printListNode();
    }
}