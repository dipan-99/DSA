package Trees.LeetCode;

import java.util.*;
import Trees.Basics.TreeNode;

public class LC114_Flatten_Binary_Tree_to_Linked_List {

    // Optimal Solution --- TC = O(N), SC = O(1)
    public void flattenSOL1(TreeNode root) {
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left != null) {
                TreeNode prev = curr.left;

                while (prev.right != null) {
                    prev = prev.right;
                }

                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }

            curr = curr.right;
        }
    }

    // Better Solution --- TC = O(N), SC = O(N)
    List<TreeNode> node = new ArrayList<>();

    public void flattenSOL2(TreeNode root) {
        pre(root);

        for (int i = 0; i < node.size() - 1; i++) {
            TreeNode curr = node.get(i);

            curr.left = null;
            curr.right = node.get(i + 1);
        }
    }

    public void pre(TreeNode root) {
        if (root == null) return;

        node.add(root);
        pre(root.left);
        pre(root.right);
    }
}
