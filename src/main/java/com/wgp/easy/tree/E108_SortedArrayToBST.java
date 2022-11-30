package com.wgp.easy.tree;

import util.TreeNode;

/**
 * ����������ת��Ϊ����������
 * @author gangpeng.wgp
 * @date 2022/11/16 9:43 ����
 */
public class E108_SortedArrayToBST {

    //����һ���������� nums ������Ԫ���Ѿ��� ���� ���У����㽫��ת��Ϊһ�� �߶�ƽ�� ������������
    //
    //�߶�ƽ�� ��������һ�����㡸ÿ���ڵ���������������ĸ߶Ȳ�ľ���ֵ������ 1 ���Ķ�������


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
        //ȡ������м�ڵ㣬��ΪΪ���ڵ㣬�ٰ�����������2�룬����2�߷ֱ𹹽�һ��ƽ�������
        int mid = (left + right)/ 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = process(nums, left, mid - 1);
        node.right = process(nums, mid + 1, right);
        return node;
    }
}
