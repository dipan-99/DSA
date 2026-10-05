package Trees.LeetCode;

import java.util.ArrayList;
import java.util.List;
import  Trees.Basics.TreeNode;

public class LC144_Binary_Tree_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();

        preorder(root, result);

        return result;
    }

    public static void preorder(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.val);

        preorder(root.left, result);

        preorder(root.right, result);
    }
}
