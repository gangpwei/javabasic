package com.wgp.easy.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import util.TreeNode;

/**
 * 二叉树的所有路径
 * @author gangpeng.wgp
 * @date 2022/5/30 10:21 PM
 */
public class E257_TreeAllPath {

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

    @Test
    public void testProcess() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);

        List<String> pathList = new E257_TreeAllPath().binaryTreePaths(root);
        for (String path : pathList) {
            System.out.println(path);
        }

        root = new TreeNode(1);
        pathList = new E257_TreeAllPath().binaryTreePaths(root);
        for (String path : pathList) {
            System.out.println(path);
        }
        //Assert.assertTrue();
    }

    @Test
    public void testProcess2() throws Exception {
        TreeNode root = new TreeNode(1);

        List<String> pathList = new E257_TreeAllPath().binaryTreePaths(root);
        for (String path : pathList) {
            System.out.println(path);
        }

    }
}

