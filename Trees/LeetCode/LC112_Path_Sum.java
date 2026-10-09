package Trees.LeetCode;

import Trees.Basics.TreeNode;

public class LC112_Path_Sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        int rem = targetSum - root.val;

        return hasPathSum(root.left, rem) || hasPathSum(root.right, rem);
    }
}
