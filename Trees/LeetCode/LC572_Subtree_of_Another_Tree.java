package Trees.LeetCode;

import Trees.Basics.TreeNode;

public class LC572_Subtree_of_Another_Tree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
            return false;

        if (compare(root, subRoot))
            return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean compare(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return true;
        }

        if (A == null || B == null) {
            return false;
        }

        if (A.val != B.val) {
            return false;
        }

        if (compare(A.left, B.left) == false) {
            return false;
        }

        if (compare(A.right, B.right) == false) {
            return false;
        }

        return true;
    }
}
