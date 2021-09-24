package com.cuizx.binaryTree;

public class DFS {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(0);
        treeNode.left = new TreeNode(1);
        treeNode.left.left = new TreeNode(3);
        treeNode.right = new TreeNode(2);
        dfs(treeNode);
    }

    public static void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        dfs(root.right);
        System.out.println(root.val);
    }


}
