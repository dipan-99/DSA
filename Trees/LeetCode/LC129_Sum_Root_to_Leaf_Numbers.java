package Trees.LeetCode;

import Trees.Basics.TreeNode;

public class LC129_Sum_Root_to_Leaf_Numbers {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    private int sum(TreeNode root, int currSum) {
        if (root == null) {
            return 0;
        }

        currSum = currSum * 10 + root.val;

        if (root.left == null && root.right == null) {
            return currSum;
        }

        return sum(root.left, currSum) + sum(root.right, currSum);
    }
}
