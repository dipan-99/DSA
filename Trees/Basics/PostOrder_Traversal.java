package Trees.Basics;

public class PostOrder_Traversal {
    static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }

        postorder(root.left); // Left

        postorder(root.right); // Right

        System.out.println(root.val + " "); // Root
    }
}
