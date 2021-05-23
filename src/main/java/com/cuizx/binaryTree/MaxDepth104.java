package com.cuizx.binaryTree;

public class MaxDepth104 {

    public static void main(String[] args) {

    }

    public static int maxDepth(TreeNode root) {
        //不论是求左子树的高度还是求右子树的高度，其实都可以使用上面函数来完成
        if(root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(rightHeight, leftHeight) + 1;
    }
}
