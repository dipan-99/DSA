package Trees.Basics;

public class Compare_Trees {
    public int compare(TreeNode A, TreeNode B) {

        if (A == null && B == null) {
            return 1;
        }

        if (A == null || B == null) {
            return 0;
        }

        if (A.val != B.val) {
            return 0;
        }

        if (compare(A.left, B.left) == 0) {
            return 0;
        }

        if (compare(A.right, B.right) == 0) {
            return 0;
        }

        return 1;
    }
}
