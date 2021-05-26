package com.cuizx.binaryTree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AimedOfferLevelOrder32III {


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> nodeList = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                nodeList.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ans.add(nodeList);
        }
        for (int i = 0; i < ans.size(); i++) {
            if(i % 2 != 0) {
                Collections.reverse(ans.get(i));
            }
        }
        return ans;
    }
}
