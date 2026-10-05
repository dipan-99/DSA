package Trees.Basics;

public class Sum_of_All_Nodes {
    public static int sum(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return root.val + sum(root.left) + sum(root.right);
    }
}
