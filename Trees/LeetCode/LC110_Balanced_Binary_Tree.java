package Trees.LeetCode;

import Trees.Basics.TreeNode;

public class LC110_Balanced_Binary_Tree {

    // Better --- TC = O(N), SC = O(H)
    boolean isBalancedSOL2(TreeNode root) {
        return checkHeight(root) != -1;
    }

    static int checkHeight(TreeNode root) {
        if (root == null)
            return 0;

        int leftHeight = checkHeight(root.left);

        if (leftHeight == -1)
            return -1;

        int rightHeight = checkHeight(root.right);

        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Brute Force --- TC = O(N^2), SC = O(H)
    public boolean isBalancedSOL1(TreeNode root) {
        if (root == null)
            return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1)
            return false;

        return isBalancedSOL1(root.left) && isBalancedSOL1(root.right);
    }

    static int height(TreeNode root) {
        if (root == null)
            return -1;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
