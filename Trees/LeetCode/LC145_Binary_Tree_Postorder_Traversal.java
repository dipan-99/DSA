package Trees.LeetCode;

import java.util.ArrayList;
import java.util.List;
import Trees.Basics.TreeNode;

public class LC145_Binary_Tree_Postorder_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();

        postorder(root, res);

        return res;
    }

    public static void postorder(TreeNode root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }

        postorder(root.left, res);

        postorder(root.right, res);

        res.add(root.val);
    }
}
