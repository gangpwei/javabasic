package com.wgp.easy.tree;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

/**
 * 二叉树的前序遍历
 *
 * @author : gangpeng.wgp
 * @date : 2023/1/2
 */
public class E144_PreOrderTree {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        dfs(node.left, result);
        dfs(node.right, result);
    }

}