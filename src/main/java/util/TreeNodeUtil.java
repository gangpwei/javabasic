package util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gangpeng.wgp
 * @date 2022/8/22 8:52 下午
 */
public class TreeNodeUtil {
    /**
     * 数组转为二叉树
     * @param arr   输入原始数组
     * @return  返回二叉树的跟节点
     */
    public static TreeNode arrayToTree(Integer[] arr){
        int len = arr.length;
        List<TreeNode> nodes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nodes.add(null);
            } else {
                nodes.add(new TreeNode(arr[i]));
            }
        }

        for (int i = 0; i < len/2; i++) {
            TreeNode node = nodes.get(i);

            if (2*i+1 < len){
                TreeNode left = nodes.get(2*i+1);
                node.setLeft(left);
            }
            if (2*i+2 < len) {
                TreeNode right = nodes.get(2*i+2);
                node.setRight(right);
            }
        }
        return nodes.get(0);
    }

}
