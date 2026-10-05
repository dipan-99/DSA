package Trees.Basics;

public class Count_of_Nodes {
    public static int countNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return 1 + left + right;
    }
}
