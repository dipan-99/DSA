package Trees.Basics;

public class Sum_Binary_Tree {
    boolean valid;

    public int isSumTree(TreeNode A) {
        valid = true;
        sum(A);
        return valid ? 1 : 0;
    }

    long sum(TreeNode root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null) {
            return root.val;
        }

        long leftSum = sum(root.left);
        long rightSum = sum(root.right);

        if (root.val != leftSum + rightSum) {
            valid = false;
        }

        return root.val + leftSum + rightSum;
    }
}
