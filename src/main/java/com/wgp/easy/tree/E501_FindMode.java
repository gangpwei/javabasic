package com.wgp.easy.tree;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import util.TreeNode;

/**
 * 二叉搜索树中的众数
 * @author gangpeng.wgp
 * @date 2022/5/30 10:21 PM
 */
public class E501_FindMode {
    public int[] findMode(TreeNode root) {
        if(root == null) return null;

        //中序遍历，得到一个有序数组
        List<Integer> midList = mid(root);
        int maxCount = 0;
        int lastVal = 0;
        int count = 0;
        List<Integer> result = new ArrayList<>();

        if(midList.size() == 1) {
            return new int[]{root.val};
        }

        for (int i = 0;i < midList.size(); i++) {
            Integer integer =  midList.get(i);
            if(integer == lastVal || i == 0) {
                count++;
            }

            if(integer != lastVal  && i != 0){
                if(count > maxCount ){
                    result.clear();
                    maxCount = count;
                    result.add(lastVal);
                }else if(count == maxCount){
                    result.add(lastVal);
                }
                count = 1;
            }

            if(i == midList.size() -1 ){
                if(count > maxCount){
                    result = new ArrayList<>();
                    maxCount = count;
                    result.add(integer);
                }else if(count == maxCount){
                    result.add(integer);
                }
            }
            lastVal = integer;
        }
        return result.stream().mapToInt(x -> x).toArray();
    }

    private List<Integer> mid(TreeNode root) {
        if(root == null) return null;
        List<Integer> list = new ArrayList<Integer>();
        mid(root, list);
        return list;
    }

    private void mid(TreeNode root, List<Integer> result) {
        if(root == null) return ;

        mid(root.left, result);
        result.add(root.val);
        mid(root.right, result);
    }

    @Test
    public void testProcess() throws Exception {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(2);

        int[] result = new E501_FindMode().findMode(root);
        Assert.assertEquals(2, result[0]);
    }

    @Test
    public void testProcess2() throws Exception {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);

        int[] result = new E501_FindMode().findMode(root);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(2, result[1]);
    }

    @Test
    public void testProcess3() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        int[] result = new E501_FindMode().findMode(root);
        Assert.assertEquals(1, result[0]);

    }

}

