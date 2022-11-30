package com.wgp.easy.tree;

import util.TreeNode;

/**
 * 将有序数组转换为二叉搜索树
 * @author gangpeng.wgp
 * @date 2022/11/16 9:43 下午
 */
public class E108_SortedArrayToBST {

    //给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
    //
    //高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。


    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        return process(nums, 0, nums.length -1);
    }

    private TreeNode process(int[] nums, int left, int right){
        if(left > right){
            return null;
        }
        //取数组的中间节点，作为为根节点，再把数组拆成左右2半，左右2边分别构建一个平衡二叉树
        int mid = (left + right)/ 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = process(nums, left, mid - 1);
        node.right = process(nums, mid + 1, right);
        return node;
    }
}
