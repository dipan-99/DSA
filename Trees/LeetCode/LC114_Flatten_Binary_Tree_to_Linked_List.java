package Trees.LeetCode;

import java.util.*;
import Trees.Basics.TreeNode;

public class LC114_Flatten_Binary_Tree_to_Linked_List {
    List<TreeNode> node = new ArrayList<>();

    public void flatten(TreeNode root) {
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
