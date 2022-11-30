package com.wgp.easy.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import util.TreeNode;

/**
 * 判断它是否是高度平衡的二叉树
 * @author gangpeng.wgp
 * @date 2022/5/30 10:21 PM
 */
public class E257_TreeAllPath {

    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return null;
        }
        List<String> result = new ArrayList<>();
        List<String> leftPathList = binaryTreePaths(root.left, String.valueOf(root.val));
        if(leftPathList != null){
            result.addAll(leftPathList);
        }

        List<String> rightPathList = binaryTreePaths(root.right, String.valueOf(root.val));
        if(rightPathList != null){
            result.addAll(rightPathList);
        }

        if(leftPathList == null && rightPathList == null){
            return Collections.singletonList(String.valueOf(root.val));
        }

        return result;
    }

    public List<String> binaryTreePaths(TreeNode currentNode, String path) {
        if(currentNode == null){
            return null;
        }

        path += "->" + String.valueOf(currentNode.val);

        List<String> result = new ArrayList<>();

        String tempPath = path;

        List<String> leftPathList = binaryTreePaths(currentNode.left, tempPath);
        if(leftPathList != null){
            result.addAll(leftPathList);
        }

        List<String> rightPathList = binaryTreePaths(currentNode.right, tempPath);
        if(rightPathList != null){
            result.addAll(rightPathList);
        }

        if(leftPathList == null && rightPathList == null){
            return Collections.singletonList(path);
        }

        return result;
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

