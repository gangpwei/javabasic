package com.wgp.easy.tree;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

/**
 * 二叉树的中序遍历
 */
public class E94_InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        process(root.left, result);
        result.add(root.val);
        process(root.right, result);
        return result;
    }

    public void process(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        process(root.left, result);
        result.add(root.val);
        process(root.right, result);
    }
}