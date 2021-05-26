package com.cuizx.binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AimedOfferLevelOrder32I {


    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size = 0;
        List<List<TreeNode>> list = new LinkedList<>();
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<TreeNode> nodeList = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                nodeList.add(node);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            list.add(nodeList);
            size += n;
        }
        int[] ans = new int[size];
        int idx = 0;
        for (List<TreeNode> nodeList : list) {
            for (TreeNode treeNode : nodeList) {
                ans[idx] = treeNode.val;
                idx++;
            }
        }
        return ans;
    }
}
