package Trees.LeetCode;

import java.util.ArrayList;
import java.util.List;
import Trees.Basics.TreeNode;

public class LC94_Binary_Tree_Inorder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();

        inorder(root, res);

        return res;
    }

    public static void inorder(TreeNode root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }

        inorder(root.left, res);

        res.add(root.val);

        inorder(root.right, res);
    }
}
