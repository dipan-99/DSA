package Trees.Basics;

public class Max_Value_in_Tree {
    // SOL 1
    public static int maxValue(TreeNode root) {

        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int left = maxValue(root.left);
        int right = maxValue(root.right);

        return Math.max(root.val, Math.max(left, right));
    }

    // SOL 2
    int max = Integer.MIN_VALUE;

    void findMax(TreeNode root) {

        if (root == null) {
            return;
        }

        max = Math.max(max, root.val);

        findMax(root.left);
        findMax(root.right);
    }
}
