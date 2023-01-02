package com.wgp.middle.treenode;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

/**
 * 二叉树展开为链表
 * @author : gangpeng.wgp
 * @date : 2022/12/7
 */
class Solution {

    //给你二叉树的根结点 root ，请你将它展开为一个单链表：
    //
    //展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
    //展开后的单链表应该与二叉树 先序遍历 顺序相同。

    /**
     * 1、前序遍历，把所有节点放到List里
     * 2、遍历List，前一个节点的右节点指向当前节点，置空前一个节点的左节点
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
