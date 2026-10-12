package Trees.LeetCode;

import Trees.Basics.TreeNode;

public class LC101_Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return false;

        root.right = rev(root.right);

        return isSame(root.left, root.right);
    }

    public TreeNode rev(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        rev(root.left);
        rev(root.right);

        return root;
    }

    public boolean isSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }
}
