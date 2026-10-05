package Trees.Basics;

public class InOrder_Traversal {
    static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left); // Left

        System.out.print(root.val + " "); // Root

        inorder(root.right); // Right
    }
}
