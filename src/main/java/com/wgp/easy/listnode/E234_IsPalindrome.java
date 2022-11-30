package com.wgp.easy.listnode;

import java.util.Stack;

import easy.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * �ж��Ƿ������
 * @author : gangpeng.wgp
 * @date : 2022/11/16
 */
public class E234_IsPalindrome {

    /**
     * ��ջ���������Դ���
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode temp = head;

        //���ݴ���ջ��
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        head = temp;

        //��ջ��������β��Ԫ�أ�������ͷ�����ȶ�
        while(!stack.empty()){
            if(stack.pop() != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }



    @Test
    public void testCase() throws Exception {

        int[] nums1 = {1,2,2,1};
        assertTrue(new E234_IsPalindrome().isPalindrome(ListNode.getListNode(nums1)));

        int[] nums2 = {1,2};
        assertFalse(new E234_IsPalindrome().isPalindrome(ListNode.getListNode(nums2)));

    }
}