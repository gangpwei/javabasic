package com.wgp.easy.listnode;

import java.util.Stack;

import com.wgp.easy.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * 判断是否回文数
 * @author : gangpeng.wgp
 * @date : 2022/11/16
 */
public class E234_IsPalindrome {

    /**
     * 用栈先入后出特性处理
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode temp = head;

        //数据存入栈中
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        head = temp;

        //出栈，即链表尾部元素，和链表头部做比对
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