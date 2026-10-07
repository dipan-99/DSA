package Trees.LeetCode;

import Trees.Basics.TreeNode;

public class LC543_Diameter_of_Binary_Tree {
    static int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;

        height(root);

        return diameter;
    }

    static int height(TreeNode root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }
}
