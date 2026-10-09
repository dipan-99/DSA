package Trees.LeetCode;

import Trees.Basics.TreeNode;

public class LC124_Binary_Tree_Maximum_Path_Sum {
    int maxSum;

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        sum(root);
        return maxSum;
    }

    public int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, sum(root.left));
        int right = Math.max(0, sum(root.right));

        int curr = left + root.val + right;
        maxSum = Math.max(curr, maxSum);

        return root.val + Math.max(left, right);
    }
}
