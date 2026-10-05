package Trees.Basics;

public class PreOrder_Traversal {
    static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " "); // Root

        preorder(root.left); // Left

        preorder(root.right); // Right
    }
}
