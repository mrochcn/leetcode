package com.cuizx.daily;

import com.cuizx.binaryTree.TreeNode;

public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        if (root.getVal() > high) {
            return rangeSumBST(root, low, high);
        }

        if (root.getVal() < low) {
            return rangeSumBST(root, low, high);
        }

        return root.getVal() + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }

//    public void dfs(TreeNode treeNode, int low, int high, int ans) {
//        if (treeNode == null) {
//            return;
//        }
//        if (treeNode.getVal() >= low && treeNode.getVal() <= high) {
//            ans = ans + treeNode.getVal();
//        }
//        dfs(treeNode.left, low, high, ans);
//        dfs(treeNode.right, low, high, ans);
//    }

}
