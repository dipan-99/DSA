package Trees.Basics;

public class Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode A) {
        if (A == null)
            return null;

        invertTree(A.left);
        invertTree(A.right);

        TreeNode temp = A.left;
        A.left = A.right;
        A.right = temp;

        return A;
    }
}
