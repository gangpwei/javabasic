package com.wgp.easy.listnode;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

/**
 * 二叉树的所有路径
 * @author gangpeng.wgp
 * @date 2022/12/2 上午12:02
 */
public class E257_binaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, null, result);
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result){
        if(node == null){
            return;
        }
        path = path == null ? String.valueOf(node.val) : path + "->" + node.val;
        if(node.left == null && node.right == null){
            result.add(path);
            return;
        }
        dfs(node.left, path, result);
        dfs(node.right, path, result);
    }
}
