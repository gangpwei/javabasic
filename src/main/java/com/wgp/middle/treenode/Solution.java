package com.wgp.middle.treenode;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

/**
 * ������չ��Ϊ����
 * @author : gangpeng.wgp
 * @date : 2022/12/7
 */
class Solution {

    //����������ĸ���� root �����㽫��չ��Ϊһ��������
    //
    //չ����ĵ�����Ӧ��ͬ��ʹ�� TreeNode ������ right ��ָ��ָ����������һ����㣬������ָ��ʼ��Ϊ null ��
    //չ����ĵ�����Ӧ��������� ������� ˳����ͬ��

    /**
     * 1��ǰ������������нڵ�ŵ�List��
     * 2������List��ǰһ���ڵ���ҽڵ�ָ��ǰ�ڵ㣬�ÿ�ǰһ���ڵ����ڵ�
     * @param root
     */
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        preorderTraversal(root, list);
        int size = list.size();
        for (int i = 1; i < size; i++) {
            TreeNode prev = list.get(i - 1), curr = list.get(i);
            prev.left = null;
            prev.right = curr;
        }
    }

    public void preorderTraversal(TreeNode root, List<TreeNode> list) {
        if (root != null) {
            list.add(root);
            preorderTraversal(root.left, list);
            preorderTraversal(root.right, list);
        }
    }
}
