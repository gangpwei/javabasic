package com.wgp.easy.listnode;

import java.util.ArrayList;
import java.util.List;

import easy.ListNode;
import org.junit.Test;

public class IntersectionNode {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> intersectionList = new ArrayList<>();
        if(headA == null || headB == null){
            return null;
        }
        while(headA != null){
            listA.add(headA.val);
            headA = headA.next;
        }
        while(headB != null){
            listB.add(headB.val);
            headB = headB.next;
        }
        int minLength = listA.size() < listB.size() ? listA.size() : listB.size();
        for(int i= 0; i< minLength ; i++){
            int valA = listA.get(listA.size()-1 - i);
            int valB = listB.get(listB.size()-1 - i);
            if(valA == valB){
                intersectionList.add(valA);
            }else{
                break;
            }
        }
        if(intersectionList.size() == 0){
            return null;
        }
        ListNode tempNode = null;
        ListNode node = null;
        for(Integer n:intersectionList){
            node = new ListNode(n);
            node.next = tempNode;
            tempNode = node;
        }
        return node;

    }




    @Test
    public void testCase() throws Exception {

        int[] nums1 = {4,1,8,4,5};
        ListNode node1 = ListNode.getListNode(nums1);
        node1.printListNode();

        int[] nums2 = {5,0,1,8,4,5};
        ListNode node2 = ListNode.getListNode(nums2);
        node2.printListNode();

        ListNode result = new IntersectionNode().getIntersectionNode(node1, node2);
        result.printListNode();


    }
}