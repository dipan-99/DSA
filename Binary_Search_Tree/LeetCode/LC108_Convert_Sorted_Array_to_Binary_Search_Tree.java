package Binary_Search_Tree.LeetCode;

import Trees.Basics.TreeNode;

public class LC108_Convert_Sorted_Array_to_Binary_Search_Tree {
    public TreeNode sortedArrayToBST(int[] A) {
        return consruct(A, 0, A.length - 1);
    }

    TreeNode consruct(int[] A, int l, int r) {
        if (l > r) return null;

        int m = l + (r - l) / 2;

        TreeNode root = new TreeNode(A[m]);

        root.left = consruct(A, l, m - 1);
        root.right = consruct(A, m + 1, r);

        return root;
    }
}
