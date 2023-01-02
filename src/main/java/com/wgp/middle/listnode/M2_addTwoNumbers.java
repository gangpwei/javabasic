package com.wgp.middle.listnode;

import com.wgp.easy.ListNode;

/**
 * �����������
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
public class M2_addTwoNumbers {

    //��������?�ǿ� ��������ʾ�����Ǹ�������������ÿλ���ֶ��ǰ���?����?�ķ�ʽ�洢�ģ�����ÿ���ڵ�ֻ�ܴ洢?һλ?���֡�
    //
    //���㽫��������ӣ�������ͬ��ʽ����һ����ʾ�͵�����
    //
    //����Լ���������� 0 ֮�⣬���������������� 0?��ͷ��


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(-1);
        ListNode head = current;
        
       int carray = 0;
        while(l1 != null || l2 != null ){
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            
            int sum = val1 + val2 + carray;
            carray = sum/10;
            current.next = new ListNode(sum%10);

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            current = current.next;
        }
        if(carray > 0){
            current.next = new ListNode(carray);
        }
        return head.next;
    }
}