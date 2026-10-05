package Trees.Basics;

public class Depth_Of_Node {
    void depth(TreeNode root, int depth) {

        if (root == null) {
            return;
        }

        System.out.println(root.val + " : " + depth);

        depth(root.left, depth + 1);
        depth(root.right, depth + 1);
    }
}