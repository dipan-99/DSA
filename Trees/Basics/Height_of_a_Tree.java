package Trees.Basics;

public class Height_of_a_Tree {
    static int height(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}