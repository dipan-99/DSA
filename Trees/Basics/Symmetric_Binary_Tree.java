package Trees.Basics;

public class Symmetric_Binary_Tree {
    public int isSymmetric(TreeNode A) {

        if (A == null) {
            return 1;
        }

        TreeNode invertRight = invert(A.right);

        return isEqual(A.left, invertRight) ? 1 : 0;
    }

    public static TreeNode invert(TreeNode A) {

        if (A == null) {
            return null;
        }

        invert(A.left);
        invert(A.right);

        TreeNode temp = A.left;
        A.left = A.right;
        A.right = temp;

        return A;
    }

    public static boolean isEqual(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return true;
        }

        if (A == null || B == null) {
            return false;
        }

        if (A.val != B.val) {
            return false;
        }

        boolean left = isEqual(A.left, B.left);
        boolean right = isEqual(A.right, B.right);

        return left && right;
    }
}
