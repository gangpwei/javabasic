package com.wgp.middle.listnode;

import com.wgp.easy.ListNode;

/**
 * �ָ�����
 *
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
class M86_RerangeListNode {
    //����һ�������ͷ�ڵ� head ��һ���ض�ֵ x �������������зָ���ʹ������ С�� x �Ľڵ㶼������ ���ڻ���� x �Ľڵ�֮ǰ��
    //
    //��Ӧ�� ���� ����������ÿ���ڵ�ĳ�ʼ���λ�á�

    public ListNode partition(ListNode head, int x) {
        //Ū2������һ����С��X�ģ�һ������ڵ���X�ġ��ٰѴ���X�Ľӵ�С��X�ĺ���
        ListNode smallHead = new ListNode(0, head);
        ListNode small = smallHead;
        ListNode largeHead = new ListNode(0, head);
        ListNode large = largeHead;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val < x) {
                small.next = curr;
                small = small.next;
            } else {
                large.next = curr;
                large = large.next;
            }
            curr = curr.next;
        }
        //ע�⣺����Ҫ�Ͽ���������С��X�Ľڵ��γɻ�
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;

    }
}