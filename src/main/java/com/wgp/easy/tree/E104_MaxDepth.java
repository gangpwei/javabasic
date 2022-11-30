package com.wgp.easy.tree;

import util.TreeNode;

/**
 * ��������������
 */
public class E104_MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}