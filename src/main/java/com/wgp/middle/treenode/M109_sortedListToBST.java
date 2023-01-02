package com.wgp.middle.treenode;

import java.util.ArrayList;
import java.util.List;

import com.wgp.easy.ListNode;
import util.TreeNode;

/**
 * ��������ת������������
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
class M109_sortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        List<ListNode> nodeList = new ArrayList<ListNode>();
        
        //�������нڵ㣬����List��
        while(head != null){
            nodeList.add(head);
            head = head.next;
        }
        
        return sortedListToBST(nodeList, 0, nodeList.size() - 1);
    }

    public TreeNode sortedListToBST(List<ListNode> nodeList, int left, int right) {
        //ע�⣺������������ > ������ >= 
        if(left > right){
            return null;
        }
        int mid = (left + right )/2;
        TreeNode leftNode = sortedListToBST(nodeList, left, mid -1);
        TreeNode rightNode = sortedListToBST(nodeList, mid +1, right);
        return new TreeNode(nodeList.get(mid).val, leftNode, rightNode);
    }
}