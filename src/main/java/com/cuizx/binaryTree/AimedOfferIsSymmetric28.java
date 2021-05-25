package com.cuizx.binaryTree;

import com.cuizx.list.ListNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AimedOfferIsSymmetric28 {

    public static void main(String[] args) {

    }
    /**
     * 层序遍历不适用
     */
//    public static boolean isSymmetric(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        List<List<TreeNode>> list = new LinkedList<>();
//        while (!queue.isEmpty()) {
//            int n = queue.size();
//            List<TreeNode> nodeList = new LinkedList<>();
//            for (int i = 0; i < n; i++) {
//                TreeNode node = queue.poll();
//                nodeList.add(node);
//                if (node.left != null) {
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                }
//            }
//            list.add(nodeList);
//        }
//        for (List<TreeNode> nodeList : list) {
//            if (isSymmetricList(nodeList)) {
//                continue;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean isSymmetricList(List<TreeNode> list) {
//        int left = 0;
//        int right = list.size() - 1;
//        while (left < right) {
//            if (list.get(left).val == list.get(right).val) {
//                left++;
//                right--;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
}
